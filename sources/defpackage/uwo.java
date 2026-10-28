package defpackage;

import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class uwo {
    private final List a;

    public uwo(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof uwo) && awrc.c(this.a, ((uwo) obj).a);
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "VoiceoverRepositoryState(voiceoverSegments=" + this.a + ')';
    }
}
