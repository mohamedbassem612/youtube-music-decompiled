package j$.time;

/* JADX INFO: compiled from: r8-map-id-e301aa0cd0080022d8768213a337444ab11b5cf0879c5463888382b3dcffb041 */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Clock {
    public static final /* synthetic */ int a = 0;

    static {
        System.currentTimeMillis();
    }

    public static Clock systemUTC() {
        return a.c;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public abstract Instant instant();
}
