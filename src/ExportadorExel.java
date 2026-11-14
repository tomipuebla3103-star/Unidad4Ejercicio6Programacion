public class ExportadorExel implements Exportable{
    @Override
    public void exportar(String contenidoReporte) {

        System.out.println("===== REPORTE EXCEL =====");
        System.out.println("| REPORTE FINANCIERO |");
        System.out.println("| " + contenidoReporte + " |");
        System.out.println("Fin del archivo Excel.");

    }
}
