package defpackage;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
final class aept extends aeps {
    @Override // defpackage.aeps
    public final String a(String str) {
        if (!this.a.matcher(str).find()) {
            return null;
        }
        boolean zContains = str.contains("owc=yes");
        boolean zContains2 = str.contains("itag=0");
        String str2 = this.b;
        if (zContains) {
            return str2.concat(zContains2 ? "-prewarm-itag0" : "-prewarm");
        }
        return str2;
    }
}
