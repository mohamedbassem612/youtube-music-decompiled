package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvi extends ept implements acvm {
    public final ajwo a;

    public acvi(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acvi) && Objects.equals(this.a, ((acvi) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return acfz.J(new Object[]{this.a}, acvi.class);
    }
}
