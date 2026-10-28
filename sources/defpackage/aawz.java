package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public class aawz {
    private static final agfm g = agfm.d(",");
    public final long a;
    public final long b;
    public aawy c;
    public final boolean d;
    public final boolean e;
    public ahha f;

    public aawz(ywx[] ywxVarArr, wgs wgsVar, long j, long j2) {
        wgsVar.e();
        this.d = wgsVar.I();
        this.e = wgsVar.af();
        this.a = j;
        this.b = j2;
        for (ywx ywxVar : ywxVarArr) {
            if (ywxVar.a.equals("http://youtube.com/streaming/metadata/segment/102015")) {
                this.f = new ahha(this, ywxVar);
            } else if (ywxVar.a.equals("http://youtube.com/streaming/metadata/streamer/092019")) {
                this.c = new aawy(this, ywxVar);
            }
        }
    }

    public static List a(ywx ywxVar, String str) {
        String strD = ywxVar.d(str);
        if (strD == null || strD.isEmpty()) {
            return agpi.a;
        }
        List listH = g.h(strD);
        return listH.subList(0, listH.size() - 1);
    }

    public aawz(ywx ywxVar, ywx ywxVar2, wgs wgsVar, long j, long j2) {
        wgsVar.e();
        this.d = wgsVar.I();
        this.e = wgsVar.af();
        this.b = j2;
        this.a = j;
        if (ywxVar != null) {
            this.f = new ahha(this, ywxVar);
        }
        if (ywxVar2 != null) {
            this.c = new aawy(this, ywxVar2);
        }
    }
}
