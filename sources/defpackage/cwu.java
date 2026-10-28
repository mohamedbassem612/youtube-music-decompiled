package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class cwu implements cwn {
    public final agke a;
    public final int b;

    private cwu(int i, agke agkeVar) {
        this.b = i;
        this.a = agkeVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static cwu c(int i, bwb bwbVar) {
        cwn cwvVar;
        String str;
        String str2;
        agjz agjzVar = new agjz(4);
        int i2 = bwbVar.d;
        int iB = -2;
        while (bwbVar.d() > 8) {
            int iJ = bwbVar.j();
            int iJ2 = bwbVar.c + bwbVar.j();
            bwbVar.O(iJ2);
            if (iJ != 1414744396) {
                cws cwsVar = null;
                switch (iJ) {
                    case 1718776947:
                        if (iB != 2) {
                            if (iB == 1) {
                                int iL = bwbVar.l();
                                if (iL == 1) {
                                    str = "audio/raw";
                                } else if (iL == 85) {
                                    str = "audio/mpeg";
                                } else if (iL == 255) {
                                    str = "audio/mp4a-latm";
                                } else if (iL != 8192) {
                                    str = iL != 8193 ? null : "audio/vnd.dts";
                                } else {
                                    str = "audio/ac3";
                                }
                                if (str != null) {
                                    int iL2 = bwbVar.l();
                                    int iJ3 = bwbVar.j();
                                    bwbVar.Q(6);
                                    int iP = bwp.p(bwbVar.l());
                                    int iL3 = bwbVar.d() > 0 ? bwbVar.l() : 0;
                                    bsd bsdVar = new bsd();
                                    bsdVar.e(str);
                                    bsdVar.G = iL2;
                                    bsdVar.I = iJ3;
                                    if (str.equals("audio/raw") && iP != 0) {
                                        bsdVar.J = iP;
                                    }
                                    if (str.equals("audio/mp4a-latm") && iL3 > 0) {
                                        byte[] bArr = new byte[iL3];
                                        bwbVar.K(bArr, 0, iL3);
                                        bsdVar.r = agke.q(bArr);
                                    }
                                    cwvVar = new cwv(new bse(bsdVar));
                                } else {
                                    bvx.e("StreamFormatChunk", a.bR(iL, "Ignoring track with unsupported format tag "));
                                }
                            } else {
                                bvx.e("StreamFormatChunk", "Ignoring strf box for unsupported track type: ".concat(bwp.P(iB)));
                            }
                            cwvVar = cwsVar;
                            break;
                        } else {
                            bwbVar.Q(4);
                            int iJ4 = bwbVar.j();
                            int iJ5 = bwbVar.j();
                            bwbVar.Q(4);
                            int iJ6 = bwbVar.j();
                            switch (iJ6) {
                                case 808802372:
                                case 877677894:
                                case 1145656883:
                                case 1145656920:
                                case 1482049860:
                                case 1684633208:
                                case 2021026148:
                                    str2 = "video/mp4v-es";
                                    break;
                                case 826496577:
                                case 828601953:
                                case 875967048:
                                    str2 = "video/avc";
                                    break;
                                case 842289229:
                                    str2 = "video/mp42";
                                    break;
                                case 859066445:
                                    str2 = "video/mp43";
                                    break;
                                case 1196444237:
                                case 1735420525:
                                    str2 = "video/mjpeg";
                                    break;
                                default:
                                    str2 = null;
                                    break;
                            }
                            if (str2 != null) {
                                bsd bsdVar2 = new bsd();
                                bsdVar2.u = iJ4;
                                bsdVar2.v = iJ5;
                                bsdVar2.e(str2);
                                cwvVar = new cwv(new bse(bsdVar2));
                            } else {
                                bvx.e("StreamFormatChunk", a.bR(iJ6, "Ignoring track with unsupported compression "));
                                cwvVar = cwsVar;
                            }
                        }
                        break;
                    case 1751742049:
                        int iJ7 = bwbVar.j();
                        bwbVar.Q(8);
                        int iJ8 = bwbVar.j();
                        int iJ9 = bwbVar.j();
                        bwbVar.Q(4);
                        bwbVar.j();
                        bwbVar.Q(12);
                        cwvVar = new cwr(iJ7, iJ8, iJ9);
                        break;
                    case 1752331379:
                        int iJ10 = bwbVar.j();
                        bwbVar.Q(12);
                        bwbVar.j();
                        int iJ11 = bwbVar.j();
                        int iJ12 = bwbVar.j();
                        bwbVar.Q(4);
                        int iJ13 = bwbVar.j();
                        int iJ14 = bwbVar.j();
                        bwbVar.Q(4);
                        cwsVar = new cws(iJ10, iJ11, iJ12, iJ13, iJ14, bwbVar.j());
                        cwvVar = cwsVar;
                        break;
                    case 1852994675:
                        cwvVar = new cww(bwbVar.C(bwbVar.d()));
                        break;
                    default:
                        cwvVar = cwsVar;
                        break;
                }
            } else {
                cwvVar = c(bwbVar.j(), bwbVar);
            }
            if (cwvVar != null) {
                if (cwvVar.a() == 1752331379) {
                    iB = ((cws) cwvVar).b();
                }
                agjzVar.h(cwvVar);
            }
            bwbVar.P(iJ2);
            bwbVar.O(i2);
        }
        return new cwu(i, agjzVar.g());
    }

    @Override // defpackage.cwn
    public final int a() {
        return this.b;
    }

    public final cwn b(Class cls) {
        cwn cwnVar;
        int i = 0;
        do {
            agke agkeVar = this.a;
            if (i >= ((agpi) agkeVar).d) {
                return null;
            }
            cwnVar = (cwn) agkeVar.get(i);
            i++;
        } while (cwnVar.getClass() != cls);
        return cwnVar;
    }
}
