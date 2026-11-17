package bikeparq;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

class RecargoTest {

    @Test
    void tarifaDeNocheSumaRecargo() {
        assertEquals(5000, Recargo.aplicarRecargoNocturno(3000, 22));
    }

    @Test
    void horaFueraDeRangoLanzaError() {
        assertThrows(IllegalArgumentException.class, () -> Recargo.aplicarRecargoNocturno(3000, 24));
    }

    @Test
    void tarifaCeroDeNocheNoTieneRecargo() {
        assertEquals(0, Recargo.aplicarRecargoNocturno(0, 23));
    }
}
