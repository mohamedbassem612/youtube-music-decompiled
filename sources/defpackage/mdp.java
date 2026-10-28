package defpackage;

import java.util.Arrays;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class mdp {
    private final int a;

    public mdp(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof mdp) && this.a == ((mdp) obj).a;
    }

    public final int hashCode() {
        return Arrays.hashCode(new int[]{this.a});
    }

    public final String toString() {
        return "java_hash=" + this.a;
    }

    public mdp() {
        throw null;
    }
}
