package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class yfu implements agfr, zgf {
    public final awmd a;
    public final Map b = new HashMap();
    private final aunn c;
    private final SharedPreferences d;
    private final zjr e;
    private final File f;
    private jso g;
    private final yfo h;
    private final yfk i;
    private jsk j;
    private final vxu k;

    public yfu(vxu vxuVar, awmd awmdVar, yfk yfkVar, yfo yfoVar, aunn aunnVar, SharedPreferences sharedPreferences, zjr zjrVar, Context context) {
        this.k = vxuVar;
        this.a = awmdVar;
        this.h = yfoVar;
        this.c = aunnVar;
        this.d = sharedPreferences;
        this.e = zjrVar;
        this.f = context.getFilesDir();
        this.i = yfkVar;
    }

    private final synchronized jsk c(akwj akwjVar, File file) {
        boolean zM;
        boolean zM2;
        File file2;
        jso jsyVar;
        zhj.a(new File(file, "exo"));
        vxz vxzVar = this.e.j;
        if (vxzVar.m(247, 45660343L)) {
            hna.ac("instantiating SimpleCache from ExoCacheSupplier; this code path should not exist", null);
        }
        zM = vxzVar.m(281, 45696320L);
        zM2 = vxzVar.m(280, 45696319L);
        file2 = new File(file, "exo");
        anhb anhbVar = this.k.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        akwj akwjVar2 = anhbVar.k;
        if (akwjVar2 == null) {
            akwjVar2 = akwj.a;
        }
        int iBc = a.bc(akwjVar2.d);
        if (iBc == 0) {
            iBc = 1;
        }
        if (iBc - 1 != 3) {
            long j = akwjVar2.c;
            if (j == 0) {
                j = 67108864;
            }
            long j2 = akwjVar2.b;
            if (j2 == 0) {
                j2 = 268435456;
            }
            if (tym.E() * 0.1d > j2) {
                j = j2;
            }
            jsyVar = new jsy(j);
            this.g = jsyVar;
        } else {
            awmd awmdVar = this.a;
            awmdVar.getClass();
            tar tarVar = new tar(awmdVar, 14);
            akwi akwiVar = akwjVar2.e;
            if (akwiVar == null) {
                akwiVar = akwi.a;
            }
            akwi akwiVar2 = akwjVar2.f;
            if (akwiVar2 == null) {
                akwiVar2 = akwi.a;
            }
            yfw yfwVar = new yfw(tarVar, akwiVar, akwiVar2);
            this.g = yfwVar;
            jsyVar = yfwVar;
        }
        return new jtc(file2, jsyVar, new axfd(file2, akwjVar.g ? ((dov) this.c.io()).ai(this.d).getEncoded() : null, akwjVar.h, zM2, zM), null, true, zM2, zM);
    }

    private final zge e(long j, long j2) {
        String strConcat;
        File file = (File) this.a.io();
        jsk jskVar = this.j;
        if (jskVar == null) {
            strConcat = ";inst.null";
        } else {
            strConcat = ";inst.".concat(true != (jskVar instanceof ygu) ? "simple" : "ytm");
        }
        String str = strConcat;
        return file == null ? new zge(j, j2, -1L, -1L, str) : new zge(j, j2, file.getFreeSpace(), file.getTotalSpace(), str);
    }

    private final boolean f() {
        zjr zjrVar = this.e;
        if (zjrVar.j.m(74, 45379401L)) {
            return false;
        }
        return zjrVar.eI();
    }

    @Override // defpackage.agfr
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public final synchronized jsk io() {
        jsk jskVar;
        File file;
        jsk jskVarC;
        anhb anhbVar = this.k.c().j;
        if (anhbVar == null) {
            anhbVar = anhb.a;
        }
        akwj akwjVar = anhbVar.k;
        if (akwjVar == null) {
            akwjVar = akwj.a;
        }
        int iBc = a.bc(akwjVar.d);
        jskVar = null;
        if ((iBc == 0 || iBc != 2) && (file = (File) this.a.io()) != null) {
            Map map = this.b;
            jsk jskVar2 = (jsk) map.get(file);
            if (jskVar2 == null) {
                boolean zF = f();
                zhq zhqVar = zhq.ABR;
                file.getAbsolutePath();
                if (zF) {
                    jskVarC = this.h.c(this.f, file);
                    this.e.ad().af(new xwu(this, 3));
                } else {
                    jskVarC = c(akwjVar, file);
                }
                map.put(file, jskVarC);
                this.j = jskVarC;
                jskVar = jskVarC;
            } else {
                jskVar = jskVar2;
            }
        }
        return jskVar;
    }

    @Override // defpackage.zgf
    public final zge d() {
        long jD;
        long jE;
        if (f()) {
            yfo yfoVar = this.h;
            yfk yfkVar = this.i;
            long jA = yfoVar.a();
            return e(jA, yfkVar.a(jA));
        }
        jso jsoVar = this.g;
        if (jsoVar != null) {
            jD = jsoVar.d();
            jE = jsoVar.e();
        } else {
            jD = -1;
            jE = -1;
        }
        return e(jD, jE);
    }
}
