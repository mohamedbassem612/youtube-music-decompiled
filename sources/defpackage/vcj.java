package defpackage;

import com.google.android.apps.youtube.music.R;
import com.google.android.libraries.multiplatform.elements.paintunit.PaintUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class vcj implements awqk {
    private final /* synthetic */ int $cid;
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;

    public /* synthetic */ vcj(Object obj, Object obj2, int i) {
        this.$cid = i;
        this.a = obj;
        this.b = obj2;
    }

    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.awqk
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$cid;
        if (i == 0) {
            ((vcl) this.a).f((Exception) obj, (String) obj2, true == ((asdk) this.b).j ? R.string.media_generation_generic_error : 0);
            return awmy.a;
        }
        if (i == 1) {
            Object objA = ((aga) this.a).a(((Integer) obj).intValue());
            if (objA != obj2 && (objA instanceof PaintUnit)) {
                PaintUnit paintUnit = (PaintUnit) objA;
                if (paintUnit.i() && paintUnit.r() == null) {
                    this.b.add(paintUnit);
                }
            }
            return awmy.a;
        }
        if (i == 2) {
            ((vcl) this.a).f((Exception) obj, (String) obj2, true == ((asdk) this.b).j ? R.string.media_generation_generic_error : 0);
            return awmy.a;
        }
        awos awosVar = (awos) obj2;
        ((awmy) obj).getClass();
        awosVar.getClass();
        awrk awrkVar = (awrk) this.a;
        int i2 = awrkVar.a;
        awrkVar.a = i2 + 1;
        ((awou[]) this.b)[i2] = awosVar;
        return awmy.a;
    }

    public /* synthetic */ vcj(awou[] awouVarArr, awrk awrkVar, int i) {
        this.$cid = i;
        this.b = awouVarArr;
        this.a = awrkVar;
    }
}
