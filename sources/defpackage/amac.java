package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum amac implements aihr {
    WATCH_WHILE(1),
    WATCH_NEXT_TYPE_MUSIC_QUEUE_ADD_OPERATION(2),
    WATCH_NEXT_TYPE_SKIP_VIDEO(3),
    WATCH_NEXT_TYPE_GET_QUEUE(4),
    WATCH_NEXT_TYPE_MUSIC_SHUFFLE(5),
    WATCH_NEXT_TYPE_MUSIC_UNSHUFFLE(6),
    WATCH_NEXT_TYPE_QUEUE_ONLY(7);

    public final int h;

    amac(int i2) {
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
