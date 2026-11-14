//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    String reporte = "Ingresos: $500000 - Gastos: $200000 - Balance: $300000";

    ExportadorPDF pdf = new ExportadorPDF();

    ExportadorHTML excel = new ExportadorHTML();

    ExportadorHTML html = new ExportadorHTML();

    Exportable[] exportadores = {
            pdf,
            excel,
            html
    };

    MotorReportes motor = new MotorReportes(exportadores);

    motor.generarReportes(reporte);
}
