public class TreeMultiplier {

//Multiplier Inputs (The multiplier’s input and output wires can be represented by edges, the edges connect to the Node objects)
private boolean A0;
private boolean A1;
private boolean A2;
private boolean A3;
private boolean A4;
private boolean A5;
private boolean A6;
private boolean A7;
private boolean B0;
private boolean B1;
private boolean B2;
private boolean B3;
private boolean B4;
private boolean B5;
private boolean B6;
private boolean B7;

//Multiplier Output
private boolean P0;
private boolean P1;
private boolean P2;
private boolean P3;
private boolean P4;
private boolean P5;
private boolean P6;
private boolean P7;
private boolean P8;
private boolean P9;
private boolean P10;
private boolean P11;
private boolean P12;
private boolean P13;
private boolean P14;
private boolean P15;

//AND Gate instances
private ANDGate A0B0;
private ANDGate A0B1;
private ANDGate A0B2;
private ANDGate A0B3;
private ANDGate A0B4;
private ANDGate A0B5;
private ANDGate A0B6;
private ANDGate A0B7;
private ANDGate A1B0;
private ANDGate A1B1;
private ANDGate A1B2;
private ANDGate A1B3;
private ANDGate A1B4;
private ANDGate A1B5;
private ANDGate A1B6;
private ANDGate A1B7;
private ANDGate A2B0;
private ANDGate A2B1;
private ANDGate A2B2;
private ANDGate A2B3;
private ANDGate A2B4;
private ANDGate A2B5;
private ANDGate A2B6;
private ANDGate A2B7;
private ANDGate A3B0;
private ANDGate A3B1;
private ANDGate A3B2;
private ANDGate A3B3;
private ANDGate A3B4;
private ANDGate A3B5;
private ANDGate A3B6;
private ANDGate A3B7;
private ANDGate A4B0;
private ANDGate A4B1;
private ANDGate A4B2;
private ANDGate A4B3;
private ANDGate A4B4;
private ANDGate A4B5;
private ANDGate A4B6;
private ANDGate A4B7;
private ANDGate A5B0;
private ANDGate A5B1;
private ANDGate A5B2;
private ANDGate A5B3;
private ANDGate A5B4;
private ANDGate A5B5;
private ANDGate A5B6;
private ANDGate A5B7;
private ANDGate A6B0;
private ANDGate A6B1;
private ANDGate A6B2;
private ANDGate A6B3;
private ANDGate A6B4;
private ANDGate A6B5;
private ANDGate A6B6;
private ANDGate A6B7;
private ANDGate A7B0;
private ANDGate A7B1;
private ANDGate A7B2;
private ANDGate A7B3;
private ANDGate A7B4;
private ANDGate A7B5;
private ANDGate A7B6;
private ANDGate A7B7;

//Node instances
private Node N0;
private Node N1;
private Node N2;
private Node N3;
private Node N4;
private Node N5;
private Node N6;
private Node N7;
private Node N8;
private Node N9;
private Node N10;
private Node N11;
private Node N12;
private Node N13;
private Node N14;
private Node N15;
private Node N16;
private Node N17;
private Node N18;
private Node N19;
private Node N20;
private Node N21;
private Node N22;
private Node N23;
private Node N24;
private Node N25;
private Node N26;
private Node N27;
private Node N28;
private Node N29;
private Node N30;
private Node N31;
private Node N32;
private Node N33;
private Node N34;
private Node N35;
private Node N36;
private Node N37;
private Node N38;
private Node N39;
private Node N40;
private Node N41;
private Node N42;
private Node N43;
private Node N44;
private Node N45;
private Node N46;
private Node N47;
private Node N48;
private Node N49;
private Node N50;
private Node N51;
private Node N52;
private Node N53;
private Node N54;
private Node N55;

        //The Tree Multiplier constructor will construct the tree multiplier by connecting the Node objects together
        public TreeMultiplier(boolean a0, boolean a1, boolean a2, boolean a3, boolean a4, boolean a5, boolean a6, boolean a7, boolean b0, boolean b1, boolean b2, boolean b3, boolean b4, boolean b5, boolean b6, boolean b7) {
            //Input initialization
            A0 = a0;
            A1 = a1;
            A2 = a2;
            A3 = a3;
            A4 = a4;
            A5 = a5;
            A6 = a6;
            A7 = a7;
            B0 = b0;
            B1 = b1;
            B2 = b2;
            B3 = b3;
            B4 = b4;
            B5 = b5;
            B6 = b6;
            B7 = b7;

            //AND Gate initialization
            A0B0 = new ANDGate(A0, B0);
            A0B1 = new ANDGate(A0, B1);
            A0B2 = new ANDGate(A0, B2);
            A0B3 = new ANDGate(A0, B3);
            A0B4 = new ANDGate(A0, B4);
            A0B5 = new ANDGate(A0, B5);
            A0B6 = new ANDGate(A0, B6);
            A0B7 = new ANDGate(A0, B7);
            A1B0 = new ANDGate(A1, B0);
            A1B1 = new ANDGate(A1, B1);
            A1B2 = new ANDGate(A1, B2);
            A1B3 = new ANDGate(A1, B3);
            A1B4 = new ANDGate(A1, B4);
            A1B5 = new ANDGate(A1, B5);
            A1B6 = new ANDGate(A1, B6);
            A1B7 = new ANDGate(A1, B7);
            A2B0 = new ANDGate(A2, B0);
            A2B1 = new ANDGate(A2, B1);
            A2B2 = new ANDGate(A2, B2);
            A2B3 = new ANDGate(A2, B3);
            A2B4 = new ANDGate(A2, B4);
            A2B5 = new ANDGate(A2, B5);
            A2B6 = new ANDGate(A2, B6);
            A2B7 = new ANDGate(A2, B7);
            A3B0 = new ANDGate(A3, B0);
            A3B1 = new ANDGate(A3, B1);
            A3B2 = new ANDGate(A3, B2);
            A3B3 = new ANDGate(A3, B3);
            A3B4 = new ANDGate(A3, B4);
            A3B5 = new ANDGate(A3, B5);
            A3B6 = new ANDGate(A3, B6);
            A3B7 = new ANDGate(A3, B7);
            A4B0 = new ANDGate(A4, B0);
            A4B1 = new ANDGate(A4, B1);
            A4B2 = new ANDGate(A4, B2);
            A4B3 = new ANDGate(A4, B3);
            A4B4 = new ANDGate(A4, B4);
            A4B5 = new ANDGate(A4, B5);
            A4B6 = new ANDGate(A4, B6);
            A4B7 = new ANDGate(A4, B7);
            A5B0 = new ANDGate(A5, B0);
            A5B1 = new ANDGate(A5, B1);
            A5B2 = new ANDGate(A5, B2);
            A5B3 = new ANDGate(A5, B3);
            A5B4 = new ANDGate(A5, B4);
            A5B5 = new ANDGate(A5, B5);
            A5B6 = new ANDGate(A5, B6);
            A5B7 = new ANDGate(A5, B7);
            A6B0 = new ANDGate(A6, B0);
            A6B1 = new ANDGate(A6, B1);
            A6B2 = new ANDGate(A6, B2);
            A6B3 = new ANDGate(A6, B3);
            A6B4 = new ANDGate(A6, B4);
            A6B5 = new ANDGate(A6, B5);
            A6B6 = new ANDGate(A6, B6);
            A6B7 = new ANDGate(A6, B7);
            A7B0 = new ANDGate(A7, B0);
            A7B1 = new ANDGate(A7, B1);
            A7B2 = new ANDGate(A7, B2);
            A7B3 = new ANDGate(A7, B3);
            A7B4 = new ANDGate(A7, B4);
            A7B5 = new ANDGate(A7, B5);
            A7B6 = new ANDGate(A7, B6);
            A7B7 = new ANDGate(A7, B7);

            //Node and output initialization
            P0 = A0B0.output();
            N0 = new Node(A0B1.output(), A1B0.output(), false);
            P1 = N0.sum();
            N1 = new Node(A0B2.output(), A1B1.output(), A2B0.output());
            N2 = new Node(N1.sum(), N0.carry(), false);
            P2 = N2.sum();
            N3 = new Node(A0B3.output(), A1B2.output(), A2B1.output());
            N4 = new Node(N3.sum(), A3B0.output(), N1.carry());
            N5 = new Node(N4.sum(), N2.carry(), false);
            P3 = N5.sum();
            N6 = new Node(A0B4.output(), A1B3.output(), A2B2.output());
            N7 = new Node(N6.sum(), A3B1.output(), A4B0.output());
            N8 = new Node(N7.sum(), N3.carry(), N4.carry());
            N9 = new Node(N8.sum(), N5.carry(), false);
            P4 = N9.sum();
            N10 = new Node(A0B5.output(), A1B4.output(), A2B3.output());
            N11 = new Node(A3B2.output(), A4B1.output(), A5B0.output());
            N12 = new Node(N10.sum(), N11.sum(), N6.carry());
            N13 = new Node(N12.sum(), N7.carry(), N8.carry());
            N14 = new Node(N13.sum(), N9.carry(), false);
            P5 = N14.sum();
            N15 = new Node(A0B6.output(), A1B5.output(), A2B4.output());
            N16 = new Node(A3B3.output(), A4B2.output(), A5B1.output());
            N17 = new Node(N15.sum(), N16.sum(), A6B0.output());
            N18 = new Node(N17.sum(), N10.carry(), N11.carry());
            N19 = new Node(N18.sum(), N12.carry(), N13.carry());
            N20 = new Node(N19.sum(), N14.carry(), false);
            P6 = N20.sum();
            N21 = new Node(A0B7.output(), A1B6.output(), A2B5.output());
            N22 = new Node(A3B4.output(), A4B3.output(), A5B2.output());
            N23 = new Node(N21.sum(), N22.sum(), A6B1.output());
            N24 = new Node(A7B0.output(), N15.carry(), N16.carry());
            N25 = new Node(N23.sum(), N24.sum(), N17.carry());
            N26 = new Node(N25.sum(), N18.carry(), N19.carry());
            N27 = new Node(N26.sum(), N20.carry(), false);
            P7 = N27.sum();
            N28 = new Node(A1B7.output(), A2B6.output(), A3B5.output());
            N29 = new Node(A4B4.output(), A5B3.output(), A6B2.output());
            N30 = new Node(N28.sum(), N29.sum(), A7B1.output());
            N31 = new Node(N30.sum(), N21.carry(), N22.carry());
            N32 = new Node(N31.sum(), N23.carry(), N24.carry());
            N33 = new Node(N32.sum(), N25.carry(), N26.carry());
            N34 = new Node(N33.sum(), N27.carry(), false);
            P8 = N34.sum();
            N35 = new Node(A2B7.output(), A3B6.output(), A4B5.output());
            N36 = new Node(A5B4.output(), A6B3.output(), A7B2.output());
            N37 = new Node(N35.sum(), N36.sum(), N28.carry());
            N38 = new Node(N37.sum(), N29.carry(), N30.carry());
            N39 = new Node(N38.sum(), N31.carry(), N32.carry());
            N40 = new Node(N39.sum(), N33.carry(), N34.carry());
            P9 = N40.sum();
            N41 = new Node(A3B7.output(), A4B6.output(), A5B5.output());
            N42 = new Node(N41.sum(), A6B4.output(), A7B3.output());
            N43 = new Node(N42.sum(), N35.carry(), N36.carry());
            N44 = new Node(N43.sum(), N37.carry(), N38.carry());
            N45 = new Node(N44.sum(), N39.carry(), N40.carry());
            P10 = N45.sum();
            N46 = new Node(A4B7.output(), A5B6.output(), A6B5.output());
            N47 = new Node(N46.sum(), A7B4.output(), N41.carry());
            N48 = new Node(N47.sum(), N42.carry(), N43.carry());
            N49 = new Node(N48.sum(), N44.carry(), N45.carry());
            P11 = N49.sum();
            N50 = new Node(A5B7.output(), A6B6.output(), A7B5.output());
            N51 = new Node(N50.sum(), N46.carry(), N47.carry());
            N52 = new Node(N51.sum(), N48.carry(), N49.carry());
            P12 = N52.sum();
            N53 = new Node(A6B7.output(), A7B6.output(), N50.carry());
            N54 = new Node(N53.sum(), N51.carry(), N52.carry());
            P13 = N54.sum();
            N55 = new Node(A7B7.output(), N53.carry(), N54.carry());
            P14 = N55.sum();
            P15 = N55.carry();
        }

        //Multiplier outputs
        public boolean P0() { return P0; }
        public boolean P1() { return P1; }
        public boolean P2() { return P2; }
        public boolean P3() { return P3; }
        public boolean P4() { return P4; }
        public boolean P5() { return P5; }
        public boolean P6() { return P6; }
        public boolean P7() { return P7; }
        public boolean P8() { return P8; }
        public boolean P9() { return P9; }
        public boolean P10() { return P10; }
        public boolean P11() { return P11; }
        public boolean P12() { return P12; }
        public boolean P13() { return P13; }
        public boolean P14() { return P14; }
        public boolean P15() { return P15; }

        @Override
        public String toString() {
            return P15+" "+P14+" "+P13+" "+P12+" "+P11+" "+P10+" "+P9+" "+P8+" "+P7+" "+P6+" "+P5+" "+P4+" "+P3+" "+P2+" "+P1+" "+P0;
        }

}
