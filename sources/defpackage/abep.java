package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class abep {
    public final /* synthetic */ Object a;

    public /* synthetic */ abep(aawf aawfVar) {
        this.a = aawfVar;
    }

    @tcc
    public void handleVideoControlsVisibilityEvent(aazi aaziVar) {
        boolean z = aaziVar.a;
        boolean z2 = !z;
        abel abelVar = ((abes) this.a).u;
        if (z2 == abelVar.a) {
            abelVar.a = z;
            abelVar.f();
            if (abelVar.a && abelVar.getVisibility() == 0) {
                abelVar.startAnimation(abelVar.i);
            } else {
                if (abelVar.a || !abelVar.g()) {
                    return;
                }
                abelVar.startAnimation(abelVar.h);
            }
        }
    }

    public abep(Object obj) {
        this.a = obj;
    }
}
