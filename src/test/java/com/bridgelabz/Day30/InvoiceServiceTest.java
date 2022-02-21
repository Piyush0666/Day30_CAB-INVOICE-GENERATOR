package com.bridgelabz.Day30;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class InvoiceServiceTest
{
        @Test
        public void givenDistanceAndTime_ShouldReturnTotalFare() {
            InvoiceService invoiceService = new InvoiceService();
            double distance = 2.0;
            int time = 5;
            double totalFare = invoiceService.CalculateFare(distance, time);
            assertEquals(25, totalFare,0);
        }

        @Test
        public void givenLessDistanceAndTime_ShouldReturnMinFare() {
            InvoiceService invoiceService = new InvoiceService();
            double distance = 0.1;
            int time = 1;
            double totalFare = invoiceService.CalculateFare(distance, time);
            assertEquals(5.0, totalFare,0);
        }
    }
