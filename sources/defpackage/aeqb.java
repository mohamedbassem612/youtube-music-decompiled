package defpackage;

import app.rive.semantics.SemanticState;
import com.google.cardboard.sdk.R;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aeqb implements Runnable {
    final /* synthetic */ String a;
    final /* synthetic */ aeqc b;
    final /* synthetic */ int c;
    final /* synthetic */ int d;
    final /* synthetic */ int e;
    final /* synthetic */ int f;
    final /* synthetic */ int g;
    final /* synthetic */ boolean h;
    final /* synthetic */ long i;
    final /* synthetic */ aeqd j;
    final /* synthetic */ int k;
    final /* synthetic */ int l;

    public aeqb(aeqd aeqdVar, String str, aeqc aeqcVar, int i, int i2, int i3, int i4, int i5, int i6, int i7, boolean z, long j) {
        this.a = str;
        this.b = aeqcVar;
        this.c = i;
        this.k = i2;
        this.l = i3;
        this.d = i4;
        this.e = i5;
        this.f = i6;
        this.g = i7;
        this.h = z;
        this.i = j;
        this.j = aeqdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        aihf aihfVarCreateBuilder = apmt.a.createBuilder();
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar = (apmt) aihfVarCreateBuilder.instance;
        String str = this.a;
        str.getClass();
        apmtVar.b |= 1;
        apmtVar.c = str;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar2 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar2.b |= 2;
        aeqc aeqcVar = this.b;
        int i = (int) aeqcVar.a;
        apmtVar2.d = i;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar3 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar3.b |= 4;
        apmtVar3.e = this.c;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar4 = (apmt) aihfVarCreateBuilder.instance;
        int i2 = this.k;
        if (i2 == 0) {
            throw null;
        }
        int i3 = i2 - 1;
        apmtVar4.f = i3;
        apmtVar4.b |= 8;
        int i4 = this.l;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar5 = (apmt) aihfVarCreateBuilder.instance;
        if (i4 == 0) {
            throw null;
        }
        apmtVar5.g = i4 - 1;
        apmtVar5.b |= 16;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar6 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar6.b |= 64;
        apmtVar6.h = false;
        aeqd aeqdVar = this.j;
        if (aeqdVar.v) {
            aihf aihfVarCreateBuilder2 = akoj.a.createBuilder();
            aihfVarCreateBuilder2.copyOnWrite();
            akoj akojVar = (akoj) aihfVarCreateBuilder2.instance;
            akojVar.b |= 1;
            akojVar.d = i;
            for (int i5 = 0; i5 < 6; i5++) {
                long j = ((int[]) aeqcVar.d)[i5];
                long j2 = j > 0 ? ((long[]) aeqcVar.c)[i5] / j : 0L;
                int[] iArr = (int[]) aeqcVar.b;
                int i6 = (int) j2;
                if (iArr[i5] > 0 || i6 > 0) {
                    aihf aihfVarCreateBuilder3 = akoi.a.createBuilder();
                    int i7 = aeqd.b[i5];
                    aihfVarCreateBuilder3.copyOnWrite();
                    akoi akoiVar = (akoi) aihfVarCreateBuilder3.instance;
                    akoiVar.b |= 1;
                    akoiVar.c = i7;
                    int i8 = iArr[i5];
                    aihfVarCreateBuilder3.copyOnWrite();
                    akoi akoiVar2 = (akoi) aihfVarCreateBuilder3.instance;
                    akoiVar2.b |= 2;
                    akoiVar2.d = i8;
                    aihfVarCreateBuilder3.copyOnWrite();
                    akoi akoiVar3 = (akoi) aihfVarCreateBuilder3.instance;
                    akoiVar3.b |= 4;
                    akoiVar3.e = i6;
                    aihfVarCreateBuilder2.copyOnWrite();
                    akoj akojVar2 = (akoj) aihfVarCreateBuilder2.instance;
                    akoi akoiVar4 = (akoi) aihfVarCreateBuilder3.build();
                    akoiVar4.getClass();
                    aiie aiieVar = akojVar2.c;
                    if (!aiieVar.c()) {
                        akojVar2.c = aihn.mutableCopy(aiieVar);
                    }
                    akojVar2.c.add(akoiVar4);
                }
            }
            akoj akojVar3 = (akoj) aihfVarCreateBuilder2.build();
            aihfVarCreateBuilder.copyOnWrite();
            apmt apmtVar7 = (apmt) aihfVarCreateBuilder.instance;
            akojVar3.getClass();
            apmtVar7.j = akojVar3;
            apmtVar7.b |= SemanticState.Hidden;
        }
        int i9 = this.d;
        if (i9 != 0) {
            aihfVarCreateBuilder.copyOnWrite();
            apmt apmtVar8 = (apmt) aihfVarCreateBuilder.instance;
            apmtVar8.b |= SemanticState.LiveRegion;
            apmtVar8.k = i9;
        }
        if (i3 == 1) {
            int i10 = this.e;
            aihfVarCreateBuilder.copyOnWrite();
            apmt apmtVar9 = (apmt) aihfVarCreateBuilder.instance;
            apmtVar9.b |= SemanticState.Focused;
            apmtVar9.i = i10;
        } else if (i3 == 2) {
            int i11 = this.f;
            aihfVarCreateBuilder.copyOnWrite();
            apmt apmtVar10 = (apmt) aihfVarCreateBuilder.instance;
            apmtVar10.b |= SemanticState.Focused;
            apmtVar10.i = i11;
        }
        int i12 = this.f;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar11 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar11.b |= SemanticState.ReadOnly;
        apmtVar11.l = i12;
        int i13 = this.e;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar12 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar12.b |= SemanticState.Modal;
        apmtVar12.m = i13;
        int i14 = this.g;
        aihfVarCreateBuilder.copyOnWrite();
        apmt apmtVar13 = (apmt) aihfVarCreateBuilder.instance;
        apmtVar13.b |= SemanticState.Obscured;
        apmtVar13.n = i14;
        if (this.h) {
            aihfVarCreateBuilder.copyOnWrite();
            apmt apmtVar14 = (apmt) aihfVarCreateBuilder.instance;
            apmtVar14.b |= SemanticState.Multiline;
            apmtVar14.o = true;
        }
        xeu xeuVar = (xeu) aeqdVar.r.io();
        if (xeuVar.b) {
            xff xffVarA = xeuVar.a(aihfVarCreateBuilder, alot.SCROLL_EVENT);
            xffVarA.h = this.i;
            ztf ztfVar = xffVarA.k.e;
            xffVarA.l = ztfVar.a();
            ztfVar.k(xffVarA);
            return;
        }
        alos alosVar = (alos) alou.a.createBuilder();
        alosVar.copyOnWrite();
        alou alouVar = (alou) alosVar.instance;
        apmt apmtVar15 = (apmt) aihfVarCreateBuilder.build();
        apmtVar15.getClass();
        alouVar.d = apmtVar15;
        alouVar.c = R.styleable.AppCompatTheme_windowMinWidthMinor;
        xeuVar.d((alou) alosVar.build(), xel.c(this.i));
    }
}
