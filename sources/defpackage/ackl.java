package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
enum ackl {
    LIGHT(300, "Light"),
    REGULAR(400, "Regular"),
    MEDIUM(500, "Medium"),
    SEMIBOLD(600, "SemiBold"),
    BOLD(700, "Bold"),
    EXTRABOLD(800, "ExtraBold"),
    BLACK(900, "Black");

    final int h;
    final String i;

    ackl(int i, String str) {
        this.h = i;
        this.i = "YouTubeSans-".concat(str);
    }
}
