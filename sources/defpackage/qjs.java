package defpackage;

import app.rive.semantics.SemanticState;
import com.google.common.util.concurrent.ListenableFuture;
import j$.util.DesugarCollections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public abstract class qjs implements qjo {
    @Override // defpackage.qjo
    public final ListenableFuture a(axhz axhzVar) {
        aihf builder = axhzVar.toBuilder();
        qjr.b(qjr.a, builder);
        axfw axfwVar = ((axhz) builder.instance).j;
        if (axfwVar == null) {
            axfwVar = axfw.a;
        }
        if ((axfwVar.b & 1) != 0) {
            axfw axfwVar2 = ((axhz) builder.instance).j;
            if (axfwVar2 == null) {
                axfwVar2 = axfw.a;
            }
            axfv axfvVar = axfwVar2.c;
            if (axfvVar == null) {
                axfvVar = axfv.a;
            }
            aihf builder2 = axfvVar.toBuilder();
            qjr.b(qjr.b, builder2);
            axfw axfwVar3 = ((axhz) builder.instance).j;
            if (axfwVar3 == null) {
                axfwVar3 = axfw.a;
            }
            aihf builder3 = axfwVar3.toBuilder();
            builder3.copyOnWrite();
            axfw axfwVar4 = (axfw) builder3.instance;
            axfv axfvVar2 = (axfv) builder2.build();
            axfvVar2.getClass();
            axfwVar4.c = axfvVar2;
            axfwVar4.b |= 1;
            builder.copyOnWrite();
            axhz axhzVar2 = (axhz) builder.instance;
            axfw axfwVar5 = (axfw) builder3.build();
            axfwVar5.getClass();
            axhzVar2.j = axfwVar5;
            axhzVar2.b |= SemanticState.Hidden;
        }
        axhq axhqVar = ((axhz) builder.instance).h;
        if (axhqVar == null) {
            axhqVar = axhq.a;
        }
        if ((axhqVar.b & SemanticState.Hidden) != 0) {
            axhq axhqVar2 = ((axhz) builder.instance).h;
            if (axhqVar2 == null) {
                axhqVar2 = axhq.a;
            }
            ahag ahagVar = axhqVar2.i;
            if (ahagVar == null) {
                ahagVar = ahag.a;
            }
            aihf builder4 = ahagVar.toBuilder();
            ahad ahadVar = ((ahag) builder4.instance).e;
            if (ahadVar == null) {
                ahadVar = ahad.a;
            }
            ahad ahadVarC = qjr.c(ahadVar);
            builder4.copyOnWrite();
            ahag ahagVar2 = (ahag) builder4.instance;
            ahadVarC.getClass();
            ahagVar2.e = ahadVarC;
            ahagVar2.b |= 1;
            List listUnmodifiableList = DesugarCollections.unmodifiableList(ahagVar2.f);
            builder4.copyOnWrite();
            ((ahag) builder4.instance).f = ahag.emptyProtobufList();
            Iterator it = listUnmodifiableList.iterator();
            while (it.hasNext()) {
                ahad ahadVarC2 = qjr.c((ahad) it.next());
                builder4.copyOnWrite();
                ahag ahagVar3 = (ahag) builder4.instance;
                ahadVarC2.getClass();
                ahagVar3.a();
                ahagVar3.f.add(ahadVarC2);
            }
            ahag ahagVar4 = (ahag) builder4.instance;
            aiie<ahaf> aiieVar = (ahagVar4.c == 4 ? (ahae) ahagVar4.d : ahae.a).b;
            aihf aihfVarCreateBuilder = ahae.a.createBuilder();
            for (ahaf ahafVar : aiieVar) {
                ahad ahadVar2 = ahafVar.c;
                if (ahadVar2 == null) {
                    ahadVar2 = ahad.a;
                }
                if ((ahadVar2.b & 2) != 0) {
                    aihf builder5 = ahafVar.toBuilder();
                    ahad ahadVarC3 = qjr.c(ahadVar2);
                    builder5.copyOnWrite();
                    ahaf ahafVar2 = (ahaf) builder5.instance;
                    ahadVarC3.getClass();
                    ahafVar2.c = ahadVarC3;
                    ahafVar2.b |= 1;
                    ahafVar = (ahaf) builder5.build();
                }
                aihfVarCreateBuilder.copyOnWrite();
                ahae ahaeVar = (ahae) aihfVarCreateBuilder.instance;
                ahafVar.getClass();
                ahaeVar.a();
                ahaeVar.b.add(ahafVar);
            }
            ahae ahaeVar2 = (ahae) aihfVarCreateBuilder.build();
            builder4.copyOnWrite();
            ahag ahagVar5 = (ahag) builder4.instance;
            ahaeVar2.getClass();
            ahagVar5.d = ahaeVar2;
            ahagVar5.c = 4;
            axhq axhqVar3 = ((axhz) builder.instance).h;
            if (axhqVar3 == null) {
                axhqVar3 = axhq.a;
            }
            aihf builder6 = axhqVar3.toBuilder();
            ahag ahagVar6 = (ahag) builder4.build();
            builder6.copyOnWrite();
            axhq axhqVar4 = (axhq) builder6.instance;
            ahagVar6.getClass();
            axhqVar4.i = ahagVar6;
            axhqVar4.b |= SemanticState.Hidden;
            axhq axhqVar5 = (axhq) builder6.build();
            builder.copyOnWrite();
            axhz axhzVar3 = (axhz) builder.instance;
            axhqVar5.getClass();
            axhzVar3.h = axhqVar5;
            axhzVar3.b |= 64;
        }
        axhv axhvVar = ((axhz) builder.instance).i;
        if (axhvVar == null) {
            axhvVar = axhv.a;
        }
        if (axhvVar.k.size() != 0) {
            axhv axhvVar2 = ((axhz) builder.instance).i;
            if (axhvVar2 == null) {
                axhvVar2 = axhv.a;
            }
            aihf builder7 = axhvVar2.toBuilder();
            for (int i = 0; i < ((axhv) builder7.instance).k.size(); i++) {
                aihf builder8 = ((axhu) ((axhv) builder7.instance).k.get(i)).toBuilder();
                if (!((axhu) builder8.instance).c.isEmpty()) {
                    builder8.copyOnWrite();
                    ((axhu) builder8.instance).d = axhu.emptyLongList();
                    List listA = qjr.a(((axhu) builder8.instance).c);
                    builder8.copyOnWrite();
                    axhu axhuVar = (axhu) builder8.instance;
                    aihy aihyVar = axhuVar.d;
                    if (!aihyVar.c()) {
                        axhuVar.d = aihn.mutableCopy(aihyVar);
                    }
                    aifs.addAll(listA, axhuVar.d);
                }
                builder8.copyOnWrite();
                axhu axhuVar2 = (axhu) builder8.instance;
                axhuVar2.b &= -2;
                axhuVar2.c = axhu.a.c;
                builder7.copyOnWrite();
                axhv axhvVar3 = (axhv) builder7.instance;
                axhu axhuVar3 = (axhu) builder8.build();
                axhuVar3.getClass();
                aiie aiieVar2 = axhvVar3.k;
                if (!aiieVar2.c()) {
                    axhvVar3.k = aihn.mutableCopy(aiieVar2);
                }
                axhvVar3.k.set(i, axhuVar3);
            }
            builder.copyOnWrite();
            axhz axhzVar4 = (axhz) builder.instance;
            axhv axhvVar4 = (axhv) builder7.build();
            axhvVar4.getClass();
            axhzVar4.i = axhvVar4;
            axhzVar4.b |= SemanticState.Focused;
        }
        axgt axgtVar = ((axhz) builder.instance).g;
        if (axgtVar == null) {
            axgtVar = axgt.a;
        }
        if (axgtVar.b.size() != 0) {
            axgt axgtVar2 = ((axhz) builder.instance).g;
            if (axgtVar2 == null) {
                axgtVar2 = axgt.a;
            }
            aihf builder9 = axgtVar2.toBuilder();
            for (int i2 = 0; i2 < ((axgt) builder9.instance).b.size(); i2++) {
                aihf builder10 = ((axgs) ((axgt) builder9.instance).b.get(i2)).toBuilder();
                if (!((axgs) builder10.instance).w.isEmpty()) {
                    builder10.copyOnWrite();
                    ((axgs) builder10.instance).x = axgs.emptyLongList();
                    List listA2 = qjr.a(((axgs) builder10.instance).w);
                    builder10.copyOnWrite();
                    axgs axgsVar = (axgs) builder10.instance;
                    aihy aihyVar2 = axgsVar.x;
                    if (!aihyVar2.c()) {
                        axgsVar.x = aihn.mutableCopy(aihyVar2);
                    }
                    aifs.addAll(listA2, axgsVar.x);
                }
                builder10.copyOnWrite();
                axgs axgsVar2 = (axgs) builder10.instance;
                axgsVar2.b &= -524289;
                axgsVar2.w = axgs.a.w;
                builder9.copyOnWrite();
                axgt axgtVar3 = (axgt) builder9.instance;
                axgs axgsVar3 = (axgs) builder10.build();
                axgsVar3.getClass();
                axgtVar3.a();
                axgtVar3.b.set(i2, axgsVar3);
            }
            for (int i3 = 0; i3 < ((axgt) builder9.instance).c.size(); i3++) {
                aihf builder11 = ((axgv) ((axgt) builder9.instance).c.get(i3)).toBuilder();
                if (!((axgv) builder11.instance).c.isEmpty()) {
                    builder11.copyOnWrite();
                    ((axgv) builder11.instance).d = axgv.emptyLongList();
                    List listA3 = qjr.a(((axgv) builder11.instance).c);
                    builder11.copyOnWrite();
                    axgv axgvVar = (axgv) builder11.instance;
                    aihy aihyVar3 = axgvVar.d;
                    if (!aihyVar3.c()) {
                        axgvVar.d = aihn.mutableCopy(aihyVar3);
                    }
                    aifs.addAll(listA3, axgvVar.d);
                }
                builder11.copyOnWrite();
                axgv axgvVar2 = (axgv) builder11.instance;
                axgvVar2.b &= -2;
                axgvVar2.c = axgv.a.c;
                builder9.copyOnWrite();
                axgt axgtVar4 = (axgt) builder9.instance;
                axgv axgvVar3 = (axgv) builder11.build();
                axgvVar3.getClass();
                aiie aiieVar3 = axgtVar4.c;
                if (!aiieVar3.c()) {
                    axgtVar4.c = aihn.mutableCopy(aiieVar3);
                }
                axgtVar4.c.set(i3, axgvVar3);
            }
            builder.copyOnWrite();
            axhz axhzVar5 = (axhz) builder.instance;
            axgt axgtVar5 = (axgt) builder9.build();
            axgtVar5.getClass();
            axhzVar5.g = axgtVar5;
            axhzVar5.b |= 32;
        }
        axgw axgwVar = ((axhz) builder.instance).l;
        if (axgwVar == null) {
            axgwVar = axgw.a;
        }
        if (axgwVar.e.size() != 0) {
            axgw axgwVar2 = ((axhz) builder.instance).l;
            if (axgwVar2 == null) {
                axgwVar2 = axgw.a;
            }
            aihf builder12 = axgwVar2.toBuilder();
            for (int i4 = 0; i4 < ((axgw) builder12.instance).e.size(); i4++) {
                aihh aihhVar = (aihh) ((axgx) ((axgw) builder12.instance).e.get(i4)).toBuilder();
                qjr.b(qjr.c, aihhVar);
                builder12.copyOnWrite();
                axgw axgwVar3 = (axgw) builder12.instance;
                axgx axgxVar = (axgx) aihhVar.build();
                axgxVar.getClass();
                aiie aiieVar4 = axgwVar3.e;
                if (!aiieVar4.c()) {
                    axgwVar3.e = aihn.mutableCopy(aiieVar4);
                }
                axgwVar3.e.set(i4, axgxVar);
            }
            builder.copyOnWrite();
            axhz axhzVar6 = (axhz) builder.instance;
            axgw axgwVar4 = (axgw) builder12.build();
            axgwVar4.getClass();
            axhzVar6.l = axgwVar4;
            axhzVar6.b |= SemanticState.ReadOnly;
        }
        return c((axhz) builder.build());
    }

    protected abstract ListenableFuture c(axhz axhzVar);

    @Override // defpackage.qjo
    public final /* synthetic */ void b() {
    }
}
