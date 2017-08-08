package com.kodedu.coupling;


import javax.swing.text.html.HTML;
import java.io.PrintWriter;

public class PrinterService {


    private final Printer printer;

    public PrinterService(Printer printer)
    {

      this.printer = printer;

    }


    public void doService()
    {
        this.printer.print();

    }
}
