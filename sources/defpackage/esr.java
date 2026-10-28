package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public class esr implements Cloneable {
    public few a = fet.b;

    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final esr clone() {
        try {
            return (esr) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof esr)) {
            return false;
        }
        few fewVar = this.a;
        few fewVar2 = ((esr) obj).a;
        char[] cArr = ffs.a;
        return afxw.l(fewVar, fewVar2);
    }

    public final int hashCode() {
        few fewVar = this.a;
        if (fewVar != null) {
            return fewVar.hashCode();
        }
        return 0;
    }
}
