package ru.netology.service;


import org.junit.Test;

    public class CashBackHackServiceTest {
        CashBackHackService service = new CashBackHackService();

        @Test
        public void testAmountZero() {
            org.junit.Assert.assertEquals(service.remain(0), 1000);
        }

        @Test
        public void testAmount900() {

            org.junit.Assert.assertEquals(service.remain(999), 1);
        }
        @Test
        public void testAmount1000() {

            org.junit.Assert.assertEquals(service.remain(1000), 0);
        }

        @Test
        public void testAmount500() {

            org.junit.Assert.assertEquals(service.remain(500), 500);
        }

        @Test
        public void testAmount1001() {

            org.junit.Assert.assertEquals(service.remain(1001), 999);
        }
        @Test
        public void testAmount1() {

            org.junit.Assert.assertEquals(service.remain(1), 999);
        }
    }