package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public final class ampv {
    public final amqa a;

    public ampv(amqa amqaVar) {
        this.a = amqaVar;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof ampv) && this.a.equals(((ampv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1008001;
    }

    public final String toString() {
        return "LiveChatPollChoiceStateModel{" + String.valueOf(this.a) + '}';
    }
}
