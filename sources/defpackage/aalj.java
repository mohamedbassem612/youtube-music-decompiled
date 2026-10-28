package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;
import app.rive.semantics.SemanticState;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class aalj implements aarp {
    public static final long a;
    private final mbc b;
    private final SharedPreferences c;
    private final aalv d;
    private final awmd e;
    private final Map f = new HashMap();
    private final Set g;

    static {
        TimeUnit timeUnit = TimeUnit.MINUTES;
        a = 60000L;
    }

    public aalj(mbc mbcVar, SharedPreferences sharedPreferences, aalv aalvVar, awmd awmdVar, Set set) {
        this.b = mbcVar;
        this.c = sharedPreferences;
        this.d = aalvVar;
        this.e = awmdVar;
        this.g = set;
    }

    private static final void m(aihf aihfVar, aamw aamwVar) {
        long j = aarq.a;
        aamb aambVar = aamwVar.g;
        long jC = aambVar.c("cache_bytes_read") / 1024;
        long jC2 = aambVar.c("storage_bytes_read");
        aihfVar.copyOnWrite();
        aogy aogyVar = (aogy) aihfVar.instance;
        aogy aogyVar2 = aogy.a;
        aogyVar.b |= SemanticState.Obscured;
        aogyVar.o = jC;
        aihfVar.copyOnWrite();
        aogy aogyVar3 = (aogy) aihfVar.instance;
        aogyVar3.b |= SemanticState.Modal;
        aogyVar3.n = jC2 / 1024;
    }

    @Override // defpackage.aarp
    public final void b(aamw aamwVar) {
        if (aalu.b(aamwVar.f)) {
            aihf aihfVarC = aalu.c(aamwVar);
            aihfVarC.copyOnWrite();
            aogy aogyVar = (aogy) aihfVarC.instance;
            aogy aogyVar2 = aogy.a;
            aogyVar.h = 12;
            aogyVar.b |= 16;
            boolean z = aaut.a;
            aihfVarC.copyOnWrite();
            aogy aogyVar3 = (aogy) aihfVarC.instance;
            aogyVar3.c |= 64;
            aogyVar3.A = z;
            aihfVarC.copyOnWrite();
            aogy aogyVar4 = (aogy) aihfVarC.instance;
            aogyVar4.g = 8;
            aogyVar4.b |= 8;
            this.d.d((aogy) aihfVarC.build());
        }
    }

    @Override // defpackage.aarp
    public final void d(aamw aamwVar) {
        if (aalu.b(aamwVar.f)) {
            aihf aihfVarC = aalu.c(aamwVar);
            aihfVarC.copyOnWrite();
            aogy aogyVar = (aogy) aihfVarC.instance;
            aogy aogyVar2 = aogy.a;
            aogyVar.h = 5;
            aogyVar.b |= 16;
            aihfVarC.copyOnWrite();
            aogy aogyVar3 = (aogy) aihfVarC.instance;
            aogyVar3.b |= 8388608;
            aogyVar3.v = aalu.a(SemanticState.Focused);
            boolean z = aaut.a;
            aihfVarC.copyOnWrite();
            aogy aogyVar4 = (aogy) aihfVarC.instance;
            aogyVar4.c |= 64;
            aogyVar4.A = z;
            aihfVarC.copyOnWrite();
            aogy aogyVar5 = (aogy) aihfVarC.instance;
            aogyVar5.g = 9;
            aogyVar5.b |= 8;
            agqr it = ((agqj) this.g).iterator();
            while (it.hasNext()) {
                ((isi) it.next()).O(aihfVarC);
            }
            this.d.d((aogy) aihfVarC.build());
        }
    }

    @Override // defpackage.aarp
    public final void e(aamw aamwVar) {
        aamb aambVar = aamwVar.f;
        if (aalu.b(aambVar)) {
            long j = aarq.a;
            String strP = aambVar.p();
            if (TextUtils.isEmpty(strP)) {
                return;
            }
            Map map = this.f;
            if (!map.containsKey(strP) || this.b.f().toEpochMilli() - ((Long) map.get(strP)).longValue() >= a) {
                aihf aihfVarC = aalu.c(aamwVar);
                aihfVarC.copyOnWrite();
                aogy aogyVar = (aogy) aihfVarC.instance;
                aogy aogyVar2 = aogy.a;
                aogyVar.h = 9;
                aogyVar.b |= 16;
                this.d.d((aogy) aihfVarC.build());
                map.put(strP, Long.valueOf(this.b.f().toEpochMilli()));
            }
        }
    }

    @Override // defpackage.aarp
    public final void f(aamw aamwVar) {
        if (aalu.b(aamwVar.f)) {
            int i = aamwVar.c;
            if ((i & SemanticState.LiveRegion) == 0) {
                aihf aihfVarC = aalu.c(aamwVar);
                aihfVarC.copyOnWrite();
                aogy aogyVar = (aogy) aihfVarC.instance;
                aogy aogyVar2 = aogy.a;
                aogyVar.h = 5;
                aogyVar.b |= 16;
                int iA = aalu.a(i);
                aihfVarC.copyOnWrite();
                aogy aogyVar3 = (aogy) aihfVarC.instance;
                aogyVar3.b |= 8388608;
                aogyVar3.v = iA;
                boolean z = aaut.a;
                aihfVarC.copyOnWrite();
                aogy aogyVar4 = (aogy) aihfVarC.instance;
                aogyVar4.c |= 64;
                aogyVar4.A = z;
                aihfVarC.copyOnWrite();
                aogy aogyVar5 = (aogy) aihfVarC.instance;
                aogyVar5.g = 9;
                aogyVar5.b |= 8;
                this.d.d((aogy) aihfVarC.build());
            }
        }
    }

    @Override // defpackage.aarp
    public final void h(aamw aamwVar) {
        if (aalu.b(aamwVar.f)) {
            aihf aihfVarC = aalu.c(aamwVar);
            aihfVarC.copyOnWrite();
            aogy aogyVar = (aogy) aihfVarC.instance;
            aogy aogyVar2 = aogy.a;
            aogyVar.g = 2;
            aogyVar.b |= 8;
            aihfVarC.copyOnWrite();
            aogy aogyVar3 = (aogy) aihfVarC.instance;
            aogyVar3.b |= 8388608;
            aogyVar3.v = aalu.a(64);
            boolean z = aaut.a;
            aihfVarC.copyOnWrite();
            aogy aogyVar4 = (aogy) aihfVarC.instance;
            aogyVar4.c |= 64;
            aogyVar4.A = z;
            agqr it = ((agqj) this.g).iterator();
            while (it.hasNext()) {
                ((isi) it.next()).O(aihfVarC);
            }
            this.d.d((aogy) aihfVarC.build());
        }
    }

    @Override // defpackage.aarp
    public final void k(aamw aamwVar, aogv aogvVar, aamg aamgVar) {
        aqpc aqpcVar = aamwVar.b;
        if (aqpcVar == aqpc.TRANSFER_STATE_COMPLETE) {
            this.c.edit().putLong(tym.y("%s_offline_download_success", ((aanb) this.e.io()).d()), this.b.f().toEpochMilli()).apply();
        }
        if (aalu.b(aamwVar.f)) {
            aihf aihfVarC = aalu.c(aamwVar);
            boolean z = aaut.a;
            aihfVarC.copyOnWrite();
            aogy aogyVar = (aogy) aihfVarC.instance;
            aogy aogyVar2 = aogy.a;
            aogyVar.c |= 64;
            aogyVar.A = z;
            int iOrdinal = aqpcVar.ordinal();
            if (iOrdinal == 3) {
                aihfVarC.copyOnWrite();
                aogy aogyVar3 = (aogy) aihfVarC.instance;
                aogyVar3.h = 2;
                aogyVar3.b |= 16;
                aihfVarC.copyOnWrite();
                aogy aogyVar4 = (aogy) aihfVarC.instance;
                aogyVar4.g = 5;
                aogyVar4.b |= 8;
                aamb aambVar = aamwVar.g;
                long j = aarq.a;
                if (!aambVar.m("has_logged_first_start", false)) {
                    aihfVarC.copyOnWrite();
                    aogy aogyVar5 = (aogy) aihfVarC.instance;
                    aogyVar5.c |= SemanticState.Focused;
                    aogyVar5.B = true;
                    aambVar.h("has_logged_first_start", true);
                }
                agqr it = ((agqj) this.g).iterator();
                while (it.hasNext()) {
                    ((isi) it.next()).O(aihfVarC);
                }
                this.d.d((aogy) aihfVarC.build());
                return;
            }
            if (iOrdinal != 5) {
                if (iOrdinal == 6) {
                    aihfVarC.copyOnWrite();
                    aogy aogyVar6 = (aogy) aihfVarC.instance;
                    aogyVar6.h = 4;
                    aogyVar6.b |= 16;
                    aihfVarC.copyOnWrite();
                    aogy aogyVar7 = (aogy) aihfVarC.instance;
                    aogyVar7.g = 6;
                    aogyVar7.b |= 8;
                    m(aihfVarC, aamwVar);
                    agqr it2 = ((agqj) this.g).iterator();
                    while (it2.hasNext()) {
                        ((isi) it2.next()).O(aihfVarC);
                    }
                    this.d.d((aogy) aihfVarC.build());
                    return;
                }
                return;
            }
            aihfVarC.copyOnWrite();
            aogy aogyVar8 = (aogy) aihfVarC.instance;
            aogyVar8.h = 6;
            aogyVar8.b |= 16;
            aihfVarC.copyOnWrite();
            aogy aogyVar9 = (aogy) aihfVarC.instance;
            aogyVar9.i = aogvVar.H;
            aogyVar9.b |= 32;
            aihfVarC.copyOnWrite();
            aogy aogyVar10 = (aogy) aihfVarC.instance;
            aogyVar10.g = 7;
            aogyVar10.b |= 8;
            m(aihfVarC, aamwVar);
            agqr it3 = ((agqj) this.g).iterator();
            while (it3.hasNext()) {
                ((isi) it3.next()).O(aihfVarC);
            }
            this.d.d((aogy) aihfVarC.build());
        }
    }

    @Override // defpackage.aarp
    public final void c() {
    }

    @Override // defpackage.aarp
    public final void g() {
    }

    @Override // defpackage.aarp
    public final void a(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void i(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void j(aamw aamwVar) {
    }

    @Override // defpackage.aarp
    public final void l(aamw aamwVar) {
    }
}
