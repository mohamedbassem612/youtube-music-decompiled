package defpackage;

import j$.util.Objects;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acvj extends ept implements acvm {
    public final ajwo a;

    public acvj(ajwo ajwoVar) {
        this.a = ajwoVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof acvj) && Objects.equals(this.a, ((acvj) obj).a);
    }

    public final int hashCode() {
        return Objects.hashCode(this.a);
    }

    public final String toString() {
        return acfz.J(new Object[]{this.a}, acvj.class);
    }
}
