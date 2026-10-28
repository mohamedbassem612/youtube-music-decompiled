package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class alq {
    private static final amb A;
    private static final amb B;
    public static final float[] a;
    public static final float[] b;
    public static final amc c;
    public static final amc d;
    public static final amb e;
    public static final alo f;
    public static final alo g;
    public static final amb h;
    public static final amb i;
    public static final amb j;
    public static final alo k;
    public static final alo[] l;
    private static final float[] m;
    private static final amc n;
    private static final amc o;
    private static final amb p;
    private static final amb q;
    private static final amb r;
    private static final amb s;
    private static final amb t;
    private static final amb u;
    private static final amb v;
    private static final amb w;
    private static final amb x;
    private static final amb y;
    private static final amb z;

    static {
        float[] fArr = {0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f};
        a = fArr;
        float[] fArr2 = {0.67f, 0.33f, 0.21f, 0.71f, 0.14f, 0.08f};
        b = fArr2;
        float[] fArr3 = {0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f};
        m = fArr3;
        amc amcVar = new amc(2.4d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        n = amcVar;
        amc amcVar2 = new amc(2.2d, 0.9478672985781991d, 0.05213270142180095d, 0.07739938080495357d, 0.04045d, 0.0d, 0.0d);
        o = amcVar2;
        amc amcVar3 = new amc(-3.0d, 2.0d, 2.0d, 5.591816309728916d, 0.28466892d, 0.55991073d, -0.685490157d);
        c = amcVar3;
        amc amcVar4 = new amc(-2.0d, -1.555223d, 1.860454d, 0.012683313515655966d, 18.8515625d, -18.6875d, 6.277394636015326d);
        d = amcVar4;
        amd amdVar = alw.a;
        amb ambVar = new amb("sRGB IEC61966-2.1", fArr, alw.d, amcVar, 0);
        e = ambVar;
        amb ambVar2 = new amb("sRGB IEC61966-2.1 (Linear)", fArr, alw.d, 1.0d, 0.0f, 1.0f, 1);
        p = ambVar2;
        amb ambVar3 = new amb("scRGB-nl IEC 61966-2-2:2003", fArr, alw.d, null, new alp(1), new alp(0), -0.799f, 2.399f, amcVar, 2);
        q = ambVar3;
        amb ambVar4 = new amb("scRGB IEC 61966-2-2:2003", fArr, alw.d, 1.0d, -0.5f, 7.499f, 3);
        r = ambVar4;
        amb ambVar5 = new amb("Rec. ITU-R BT.709-5", new float[]{0.64f, 0.33f, 0.3f, 0.6f, 0.15f, 0.06f}, alw.d, new amc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 4);
        s = ambVar5;
        amb ambVar6 = new amb("Rec. ITU-R BT.2020-1", new float[]{0.708f, 0.292f, 0.17f, 0.797f, 0.131f, 0.046f}, alw.d, new amc(2.2222222222222223d, 0.9096697898662786d, 0.09033021013372146d, 0.2222222222222222d, 0.08145d, 0.0d, 0.0d), 5);
        t = ambVar6;
        amb ambVar7 = new amb("SMPTE RP 431-2-2007 DCI (P3)", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, new amd(0.314f, 0.351f), 2.6d, 0.0f, 1.0f, 6);
        u = ambVar7;
        amb ambVar8 = new amb("Display P3", new float[]{0.68f, 0.32f, 0.265f, 0.69f, 0.15f, 0.06f}, alw.d, amcVar, 7);
        v = ambVar8;
        amb ambVar9 = new amb("NTSC (1953)", fArr2, alw.a, new amc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 8);
        w = ambVar9;
        amb ambVar10 = new amb("SMPTE-C RGB", new float[]{0.63f, 0.34f, 0.31f, 0.595f, 0.155f, 0.07f}, alw.d, new amc(2.2222222222222223d, 0.9099181073703367d, 0.09008189262966333d, 0.2222222222222222d, 0.081d, 0.0d, 0.0d), 9);
        x = ambVar10;
        amb ambVar11 = new amb("Adobe RGB (1998)", new float[]{0.64f, 0.33f, 0.21f, 0.71f, 0.15f, 0.06f}, alw.d, 2.2d, 0.0f, 1.0f, 10);
        y = ambVar11;
        amb ambVar12 = new amb("ROMM RGB ISO 22028-2:2013", new float[]{0.7347f, 0.2653f, 0.1596f, 0.8404f, 0.0366f, 1.0E-4f}, alw.b, new amc(1.8d, 1.0d, 0.0d, 0.0625d, 0.031248d, 0.0d, 0.0d), 11);
        z = ambVar12;
        amb ambVar13 = new amb("SMPTE ST 2065-1:2012 ACES", new float[]{0.7347f, 0.2653f, 0.0f, 1.0f, 1.0E-4f, -0.077f}, alw.c, 1.0d, -65504.0f, 65504.0f, 12);
        A = ambVar13;
        amb ambVar14 = new amb("Academy S-2014-004 ACEScg", new float[]{0.713f, 0.293f, 0.165f, 0.83f, 0.128f, 0.044f}, alw.c, 1.0d, -65504.0f, 65504.0f, 13);
        B = ambVar14;
        ame ameVar = new ame();
        f = ameVar;
        alx alxVar = new alx();
        g = alxVar;
        amb ambVar15 = new amb("None", fArr, alw.d, amcVar2, 16);
        h = ambVar15;
        amb ambVar16 = new amb("Hybrid Log Gamma encoding", fArr3, alw.d, null, new alp(2), new alp(3), 0.0f, 1.0f, amcVar3, 17);
        i = ambVar16;
        amb ambVar17 = new amb("Perceptual Quantizer encoding", fArr3, alw.d, null, new alp(4), new alp(5), 0.0f, 1.0f, amcVar4, 18);
        j = ambVar17;
        aly alyVar = new aly();
        k = alyVar;
        l = new alo[]{ambVar, ambVar2, ambVar3, ambVar4, ambVar5, ambVar6, ambVar7, ambVar8, ambVar9, ambVar10, ambVar11, ambVar12, ambVar13, ambVar14, ameVar, alxVar, ambVar15, ambVar16, ambVar17, alyVar};
    }

    public static final double a(amc amcVar, double d2) {
        double dExp;
        double d3 = amcVar.g + 1.0d;
        double d4 = d2 < 0.0d ? -1.0d : 1.0d;
        double d5 = d2 * d4;
        double d6 = amcVar.b * d5;
        if (d6 <= 1.0d) {
            dExp = Math.pow(d6, amcVar.c);
        } else {
            dExp = Math.exp((d5 - amcVar.f) * amcVar.d) + amcVar.e;
        }
        return d3 * d4 * dExp;
    }

    public static final double b(amc amcVar, double d2) {
        double d3 = 1.0d / amcVar.b;
        double d4 = 1.0d / amcVar.c;
        double d5 = 1.0d / amcVar.d;
        double d6 = amcVar.g + 1.0d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = (d2 * d7) / d6;
        return d7 * (d8 <= 1.0d ? d3 * Math.pow(d8, d4) : amcVar.f + (d5 * Math.log(d8 - amcVar.e)));
    }

    public static final double c(amc amcVar, double d2) {
        double d3 = d2 < 0.0d ? -1.0d : 1.0d;
        double d4 = d2 * d3;
        double d5 = amcVar.d;
        double dPow = amcVar.b + (amcVar.c * Math.pow(d4, d5));
        return d3 * Math.pow((dPow >= 0.0d ? dPow : 0.0d) / (amcVar.e + (amcVar.f * Math.pow(d4, d5))), amcVar.g);
    }

    public static final double d(amc amcVar, double d2) {
        double d3 = -amcVar.b;
        double d4 = 1.0d / amcVar.g;
        double d5 = -amcVar.f;
        double d6 = 1.0d / amcVar.d;
        double d7 = d2 < 0.0d ? -1.0d : 1.0d;
        double d8 = d2 * d7;
        return d7 * Math.pow(Math.max(d3 + (amcVar.e * Math.pow(d8, d4)), 0.0d) / (amcVar.c + (d5 * Math.pow(d8, d4))), d6);
    }
}
