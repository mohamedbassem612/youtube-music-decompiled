package defpackage;

import j$.util.Objects;
import java.lang.ref.WeakReference;
import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class tbx implements tbu {
    private final WeakReference a;
    private final Class[] b;
    private final int c;

    public tbx(tbw tbwVar, Class[] clsArr) {
        this.a = new WeakReference(tbwVar);
        this.b = clsArr;
        this.c = Objects.hash(tbwVar, Integer.valueOf(Arrays.hashCode(clsArr)));
    }

    @Override // defpackage.tbu
    public final void a(Object obj) {
        tbw tbwVar = (tbw) this.a.get();
        if (tbwVar != null) {
            Class<?> cls = obj.getClass();
            Class<?>[] clsArr = this.b;
            for (int i = 0; i < clsArr.length && clsArr[i] != cls; i++) {
            }
            tbwVar.a();
        }
    }

    @Override // defpackage.tbu
    public final /* synthetic */ boolean b() {
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof tbx) {
            tbx tbxVar = (tbx) obj;
            if (tbxVar.a.get() == this.a.get() && Arrays.equals(this.b, tbxVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.c;
    }
}
