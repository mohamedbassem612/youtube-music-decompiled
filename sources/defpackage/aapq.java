package defpackage;

import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class aapq extends aapp {
    private final aogp a;
    private final List b;

    public aapq(aaps aapsVar, aapz aapzVar, mbc mbcVar, SharedPreferences sharedPreferences, vyo vyoVar, aaei aaeiVar, tbt tbtVar, vxz vxzVar) {
        super(aapsVar, aapzVar, mbcVar, sharedPreferences, vyoVar, aaeiVar, tbtVar, vxzVar);
        this.a = aogp.UNKNOWN;
        this.b = new ArrayList();
    }

    @Override // defpackage.aapp
    protected final void e(aluz aluzVar, aluy aluyVar, aaqn aaqnVar, long j, aams aamsVar) {
        if (aamsVar != null) {
            aogq aogqVar = aluyVar.c;
            if (aogqVar == null) {
                aogqVar = aogq.a;
            }
            aogp aogpVar = this.a;
            aihf builder = aogqVar.toBuilder();
            if (aogpVar != aogp.UNKNOWN) {
                builder.copyOnWrite();
                aogq aogqVar2 = (aogq) builder.instance;
                aogqVar2.h = aogpVar.h;
                aogqVar2.b |= 8;
            }
            List list = this.b;
            if (!list.isEmpty()) {
                aihf builder2 = aluzVar.toBuilder();
                builder2.copyOnWrite();
                ((aluz) builder2.instance).c = aluz.emptyIntList();
                builder2.copyOnWrite();
                aluz aluzVar2 = (aluz) builder2.instance;
                aihv aihvVar = aluzVar2.c;
                if (!aihvVar.c()) {
                    aluzVar2.c = aihn.mutableCopy(aihvVar);
                }
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    aluzVar2.c.h(((aogc) it.next()).h);
                }
                aluzVar = (aluz) builder2.build();
            }
            aihf builder3 = aluyVar.toBuilder();
            builder3.copyOnWrite();
            aluy aluyVar2 = (aluy) builder3.instance;
            aogq aogqVar3 = (aogq) builder.build();
            aogqVar3.getClass();
            aluyVar2.c = aogqVar3;
            aluyVar2.b |= 1;
            super.e(aluzVar, (aluy) builder3.build(), aaqnVar, j, aamsVar);
        }
    }
}
