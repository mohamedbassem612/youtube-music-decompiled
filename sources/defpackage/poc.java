package defpackage;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class poc implements pnz {
    public static final SecureRandom a = new SecureRandom();
    public final ahzv b;
    public final ahyy c;
    public final Throwable d;
    public final pls e;
    public final pun f;
    public final pwl g;
    public plx h;
    public String i;
    public String j;
    public String k;
    public ahyr l;
    public long n;
    public String o;
    public String p;
    public Long q;
    public String r;
    public String s;
    public final long t;
    public pax u;
    public String v;
    public final int x;
    public int y;
    public final List m = new ArrayList();
    public Set w = awnq.a;

    public poc(mbc mbcVar, ahzv ahzvVar, ahyy ahyyVar, Throwable th, pls plsVar, int i, pun punVar, pwl pwlVar) {
        this.b = ahzvVar;
        this.c = ahyyVar;
        this.d = th;
        this.e = plsVar;
        this.x = i;
        this.f = punVar;
        this.g = pwlVar;
        this.n = TimeUnit.MILLISECONDS.toMicros(mbcVar.f().toEpochMilli());
        this.t = mbcVar.b();
    }

    @Override // defpackage.pnz
    public final void a(String str) {
        str.getClass();
        this.r = str;
    }

    @Override // defpackage.pnz
    public final void b(plx plxVar) {
        if (plxVar != null) {
            this.h = plxVar;
            pxk pxkVarB = plxVar.b();
            int iAx = a.ax(pxkVarB);
            if (iAx == 0) {
                this.i = plxVar.c;
                this.v = ((pxo) pxkVarB).a;
            } else if (iAx != 1) {
                if (iAx == 2) {
                    this.q = Long.valueOf(plxVar.o);
                }
            } else {
                this.v = plxVar.d;
                this.j = ((pxl) pxkVarB).a;
                this.k = plxVar.e;
            }
        }
    }

    @Override // defpackage.pnz
    public final void c(aiec aiecVar) {
        String str = aiecVar.e;
        str.getClass();
        if (str.length() > 0) {
            List list = this.m;
            aihf aihfVarCreateBuilder = ahyg.a.createBuilder();
            aihfVarCreateBuilder.getClass();
            String str2 = aiecVar.e;
            str2.getClass();
            aewo.ab(str2, aihfVarCreateBuilder);
            aewo.ae(aiecVar.j, aihfVarCreateBuilder);
            aewo.Z(aiecVar.g, aihfVarCreateBuilder);
            String str3 = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).n;
            str3.getClass();
            aewo.aa(str3, aihfVarCreateBuilder);
            aidc aidcVar = (aiecVar.c == 12 ? (aidq) aiecVar.d : aidq.a).o;
            if (aidcVar == null) {
                aidcVar = aidc.a;
            }
            String str4 = aidcVar.b;
            str4.getClass();
            aewo.Y(str4, aihfVarCreateBuilder);
            aigj aigjVar = aiecVar.t;
            aigjVar.getClass();
            aewo.ad(aigjVar, aihfVarCreateBuilder);
            String str5 = aiecVar.f;
            str5.getClass();
            if (str5.length() > 0) {
                String str6 = aiecVar.f;
                str6.getClass();
                aewo.ac(str6, aihfVarCreateBuilder);
            }
            list.add(aewo.X(aihfVarCreateBuilder));
        }
        Set set = this.w;
        aihv aihvVar = aiecVar.u;
        aihvVar.getClass();
        this.w = atqq.r(set, atqq.aw(aihvVar));
    }
}
