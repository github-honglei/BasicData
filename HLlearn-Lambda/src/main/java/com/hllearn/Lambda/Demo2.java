package com.hllearn.Lambda;

import java.io.IOException;
import java.util.List;

import com.googlecode.lanterna.TextColor;
import com.googlecode.lanterna.gui2.BasicWindow;
import com.googlecode.lanterna.gui2.DefaultWindowManager;
import com.googlecode.lanterna.gui2.EmptySpace;
import com.googlecode.lanterna.gui2.MultiWindowTextGUI;
import com.googlecode.lanterna.gui2.Window;
import com.googlecode.lanterna.gui2.table.Table;
import com.googlecode.lanterna.screen.Screen;
import com.googlecode.lanterna.screen.TerminalScreen;
import com.googlecode.lanterna.terminal.DefaultTerminalFactory;
import com.googlecode.lanterna.terminal.Terminal;

public class Demo2 {

	public static void main(String[] args) throws IOException {
		final Table<String> table = new Table<String>("Column 1", "Column 2", "Column 3");
	    table.getTableModel().addRow("1", "2", "3");
	    table.getTableModel().addRow("1", "2", "3");
	    table.getTableModel().addRow("1", "2", "3");
	    table.getTableModel().addRow("1", "2", "3");
	    table.getTableModel().addRow("1", "2", "3");
	    table.setSelectAction(new Runnable() {
	 
	        @Override
	        public void run() {
	            List<String> data = table.getTableModel().getRow(table.getSelectedRow());
	            for (String aData : data) {
	                System.out.println(aData);
	            }
	        }
	    });
	    Window win = new BasicWindow();
	    win.setComponent(table);
	    DefaultTerminalFactory factory = new DefaultTerminalFactory();
	    Terminal terminal = factory.createTerminal();
	    Screen screen = new TerminalScreen(terminal);
	    screen.startScreen();
	    // Create gui and start gui
	    MultiWindowTextGUI gui = new MultiWindowTextGUI(screen, new DefaultWindowManager(), new EmptySpace(TextColor.ANSI.BLUE));
	    gui.addWindowAndWait(win);
	    screen.stopScreen();
	}
}
