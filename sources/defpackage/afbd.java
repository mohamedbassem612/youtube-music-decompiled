package defpackage;

import com.google.android.material.button.MaterialButton;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
final class afbd extends bld {
    private final int a;

    public afbd(int i) {
        this.a = i;
    }

    @Override // defpackage.bld
    public final /* bridge */ /* synthetic */ float a(Object obj) {
        int i = afbe.l;
        float[] fArr = ((afbe) obj).j;
        if (fArr != null) {
            return fArr[this.a];
        }
        return 0.0f;
    }

    @Override // defpackage.bld
    public final /* bridge */ /* synthetic */ void b(Object obj, float f) {
        afbe afbeVar = (afbe) obj;
        int i = afbe.l;
        float[] fArr = afbeVar.j;
        if (fArr != null) {
            int i2 = this.a;
            if (fArr[i2] != f) {
                fArr[i2] = f;
                avgj avgjVar = afbeVar.k;
                if (avgjVar != null) {
                    float fC = afbeVar.c() * 0.11f;
                    MaterialButton materialButton = (MaterialButton) avgjVar.a;
                    int i3 = (int) fC;
                    if (materialButton.h != i3) {
                        materialButton.h = i3;
                        materialButton.i();
                        materialButton.invalidate();
                    }
                }
                afbeVar.invalidateSelf();
            }
        }
    }
}
