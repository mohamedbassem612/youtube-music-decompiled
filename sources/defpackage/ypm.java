package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ypm {
    private final ywn a;
    private final boolean b;
    private final boolean c;
    private final boolean d;

    public ypm(ywn ywnVar, boolean z, boolean z2, boolean z3) {
        this.a = ywnVar;
        this.b = z;
        this.c = z2;
        this.d = z3;
    }

    private final void b(String str, zgg zggVar) {
        ywn ywnVar = this.a;
        ywnVar.l(str, zggVar.a(ywnVar.a()));
    }

    final synchronized void a(ypi ypiVar) {
        if (this.b) {
            StringBuilder sb = new StringBuilder("rn.");
            sb.append(ypiVar.a);
            sb.append(";rt.");
            sb.append(ypiVar.j);
            long j = ypiVar.i.b;
            if (j > 0) {
                long j2 = ypiVar.e;
                if (j2 > 0) {
                    sb.append(";pt.");
                    sb.append((j2 * 8000) / j);
                    sb.append(";ps.");
                    sb.append(ypiVar.e);
                } else {
                    sb.append(";bw.");
                    sb.append(ypiVar.i.b);
                }
                sb.append(";src.");
                sb.append(ypiVar.i.c);
            }
            if (ypiVar.d > 0) {
                sb.append(";pmd.");
                sb.append(ypiVar.d);
            }
            if (ypiVar.k > 0) {
                sb.append(";ct.");
                sb.append(ypiVar.k);
            }
            if (ypiVar.l != null) {
                sb.append(";ec.");
                sb.append(ypiVar.l);
            }
            if (this.c && this.d) {
                StringBuilder sb2 = ypiVar.c;
                if (sb2.length() > 0) {
                    sb.append(";d.");
                    sb.append((CharSequence) sb2);
                }
            }
            b("rqs", new ypl(sb.toString(), ypiVar.b + ypiVar.j));
        }
        if (this.c && !this.d) {
            int i = 0;
            while (true) {
                StringBuilder sb3 = ypiVar.c;
                if (i >= sb3.length()) {
                    break;
                }
                int i2 = i + 260;
                b("rqd", new ywc("rn." + ypiVar.a + ";idx." + (i / 260) + ";d." + sb3.substring(i, Math.min(i2, sb3.length()))));
                i = i2;
            }
        }
    }
}
