package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PresidentsServiceTest {

    @Test
    void getPresidents() {
        PresidentsService service = new PresidentsService();
        List<President> presidents = service.getPresidents();
        assertEquals(45, presidents.size());
    }
}
