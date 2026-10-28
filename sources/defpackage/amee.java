package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amee implements aihr {
    QUEUE_ACTION_TYPE_UNSPECIFIED(0),
    QUEUE_ACTION_TYPE_REMOVE(1),
    QUEUE_ACTION_TYPE_MOVE(2),
    QUEUE_ACTION_TYPE_ADD(3),
    QUEUE_ACTION_TYPE_SHUFFLE(4),
    QUEUE_ACTION_TYPE_LOOP_ALL(5),
    QUEUE_ACTION_TYPE_LOOP_SINGLE(6);

    public final int h;

    amee(int i2) {
        this.h = i2;
    }

    @Override // defpackage.aihr
    public final int getNumber() {
        return this.h;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return Integer.toString(this.h);
    }
}
