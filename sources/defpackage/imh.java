package defpackage;

import java.io.Serializable;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class imh implements Serializable, imm {
    private static final long serialVersionUID = -3991070998542575310L;
    private final Class a;
    private final Class b;

    public imh(Class cls, Class cls2) {
        this.a = cls;
        this.b = cls2;
    }

    @Override // defpackage.imm
    public final Class a() {
        return this.a;
    }

    @Override // java.lang.annotation.Annotation
    public final Class annotationType() {
        return imm.class;
    }

    @Override // defpackage.imm
    public final Class b() {
        return this.b;
    }

    @Override // java.lang.annotation.Annotation
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof imm) {
            imm immVar = (imm) obj;
            if (this.a.equals(immVar.a()) && this.b.equals(immVar.b())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.annotation.Annotation
    public final int hashCode() {
        return (this.a.hashCode() ^ 2034079665) + (this.b.hashCode() ^ 1750253579);
    }

    @Override // java.lang.annotation.Annotation
    public final String toString() {
        return "@com.google.android.apps.youtube.music.renderergenerator.ModelToRendererGeneratorKey(modelClass=" + this.a + ", rendererClass=" + this.b + ')';
    }
}
