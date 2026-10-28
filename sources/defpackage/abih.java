package defpackage;

import android.text.TextUtils;
import j$.time.Duration;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class abih extends acfx {
    public final String a;
    public final String b;
    final /* synthetic */ abii c;
    private final wjj k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public abih(abii abiiVar, String str, wjj wjjVar, String str2) {
        super(wjjVar.c(), wjjVar.b(), 2, 3, str);
        this.c = abiiVar;
        this.a = str;
        this.k = wjjVar;
        this.b = str2;
    }

    @Override // defpackage.acfx
    protected final void d(boolean z, boolean z2, boolean z3, final long j) {
        if (!z2 || j <= this.k.c()) {
            return;
        }
        final abii abiiVar = this.c;
        Object objIo = abiiVar.a.io();
        objIo.getClass();
        String str = this.a;
        wjj wjjVarU = ((xsc) objIo).u(str);
        if (!(wjjVarU instanceof wjj)) {
            abii.a(abiiVar, "Could not find TimeBasedScheduleInfo for cpn in onEnter: ".concat(String.valueOf(str)), null, null, 6);
        } else {
            final long jA = j - wjjVarU.a();
            abiiVar.b.execute(afwl.i(new Runnable() { // from class: abig
                /* JADX WARN: Type inference failed for: r0v6, types: [awmd, java.lang.Object] */
                @Override // java.lang.Runnable
                public final void run() {
                    aazo aazoVar = (aazo) abiiVar.c.io();
                    Duration durationOfMillis = Duration.ofMillis(j);
                    durationOfMillis.getClass();
                    Duration durationOfMillis2 = Duration.ofMillis(jA);
                    durationOfMillis2.getClass();
                    abih abihVar = this;
                    String str2 = abihVar.a;
                    str2.getClass();
                    String str3 = abihVar.b;
                    str3.getClass();
                    Object obj = ((abwk) aazoVar.b).d;
                    acfg acfgVar = obj instanceof acfg ? (acfg) obj : null;
                    if (acfgVar != null) {
                        acip acipVarM = acfgVar.m();
                        if (TextUtils.equals(acipVarM.au(), str3)) {
                            acjb acjbVarX = acipVarM.x();
                            if (acjbVarX == null || !acjbVarX.U(str2, durationOfMillis, durationOfMillis2)) {
                                return;
                            }
                            acjbVarX.e(true, acjc.REPOSITION_CHILD_PLAYBACK);
                            return;
                        }
                        zvj zvjVarA = zvk.a();
                        zvjVarA.j = 21;
                        zvjVarA.i = 1;
                        zvjVarA.d("ChildPlaybackRepositioner: Content component not found or CPN mismatch for cpn: ".concat(str3));
                        zvjVarA.c(ajtv.ERROR_LEVEL_WARNING);
                        ((zvl) aazoVar.a.io()).a(zvjVarA.a());
                    }
                }
            }));
        }
    }
}
