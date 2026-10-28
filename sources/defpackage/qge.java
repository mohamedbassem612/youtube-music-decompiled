package defpackage;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qge {
    public final Context a;
    final awmd b;
    final awmd c;
    final awmd d;
    public final awmd e;
    public final awmd f;
    public final awmd g;
    public final awmd h;
    public final awmd i;
    public final awmd j;
    public final awmd k;
    public final awmd l;
    public final awmd m;
    public final awmd n;
    public final qcz o;

    public qge(Context context, qcz qczVar, awmd awmdVar, awmd awmdVar2, awmd awmdVar3, awmd awmdVar4, awmd awmdVar5, awmd awmdVar6, awmd awmdVar7, awmd awmdVar8, awmd awmdVar9, awmd awmdVar10, awmd awmdVar11, awmd awmdVar12, awmd awmdVar13) {
        this.a = context;
        this.o = qczVar;
        this.b = awmdVar;
        this.c = awmdVar2;
        this.d = awmdVar3;
        this.e = awmdVar4;
        this.h = awmdVar7;
        this.i = awmdVar8;
        this.j = awmdVar9;
        this.f = awmdVar5;
        this.g = awmdVar6;
        this.k = awmdVar10;
        this.l = awmdVar11;
        this.m = awmdVar12;
        this.n = awmdVar13;
    }

    public static agke a(atyr atyrVar, Map map, long j) {
        agjz agjzVar = new agjz(4);
        long j2 = 0;
        for (atyp atypVar : atyrVar.c) {
            if (j >= 0) {
                long j3 = 1 + j2;
                if (j2 >= j) {
                    break;
                }
                j2 = j3;
            }
            aihf aihfVarCreateBuilder = aioq.a.createBuilder();
            long j4 = atypVar.b;
            aihfVarCreateBuilder.copyOnWrite();
            aioq aioqVar = (aioq) aihfVarCreateBuilder.instance;
            aioqVar.b |= 1;
            aioqVar.c = j4;
            if (!atypVar.c.isEmpty()) {
                String str = atypVar.c;
                aihfVarCreateBuilder.copyOnWrite();
                aioq aioqVar2 = (aioq) aihfVarCreateBuilder.instance;
                str.getClass();
                aioqVar2.b |= 2;
                aioqVar2.d = str;
            }
            aami aamiVar = (aami) map.get(atypVar.e);
            if (aamiVar != null) {
                aihfVarCreateBuilder.copyOnWrite();
                aioq aioqVar3 = (aioq) aihfVarCreateBuilder.instance;
                aioqVar3.b |= 4;
                aioqVar3.e = aamiVar.a;
            }
            agjzVar.h((aioq) aihfVarCreateBuilder.build());
        }
        return agjzVar.g();
    }
}
