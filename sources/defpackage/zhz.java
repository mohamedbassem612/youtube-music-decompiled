package defpackage;

import com.google.android.libraries.youtube.media.interfaces.QoeError;
import com.google.android.libraries.youtube.media.interfaces.QoeErrorDetail;
import j$.util.Collection;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public class zhz {
    public String b;
    public final Optional c;
    public final zhw d;
    public String e;
    public boolean f;
    public boolean g;
    public final List h;
    private Throwable j;
    private static final Pattern i = Pattern.compile("[a-z0-9_.-]+");
    public static final String a = String.valueOf(zhx.QUEUED_VIDEO_ERROR_ORIGINAL_CODE.e).concat(".");

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0038, code lost:
    
        if (r3.equals("keyerror") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r3.equals("stop") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x004a, code lost:
    
        if (r3.equals("auth") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r3.equals("") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (r3.equals("provision") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0065, code lost:
    
        if (r3.equals("unavailable") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006e, code lost:
    
        if (r3.equals("servererror") != false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0070, code lost:
    
        r7 = r2.equals(defpackage.zhw.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x008c, code lost:
    
        if (r3.equals("hdunavailable") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0095, code lost:
    
        if (r3.equals("unimplemented") != false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0097, code lost:
    
        r7 = r2.equals(r7);
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected zhz(defpackage.zhw r2, java.lang.String r3, j$.util.Optional r4, java.lang.String r5, java.lang.Throwable r6, java.lang.Object r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zhz.<init>(zhw, java.lang.String, j$.util.Optional, java.lang.String, java.lang.Throwable, java.lang.Object, boolean):void");
    }

    public static zhz d(QoeError qoeError, boolean z) {
        zhv zhvVar = new zhv(qoeError.getCode());
        ArrayList arrayList = new ArrayList();
        ArrayList details = qoeError.getDetails();
        int size = details.size();
        for (int i2 = 0; i2 < size; i2++) {
            QoeErrorDetail qoeErrorDetail = (QoeErrorDetail) details.get(i2);
            arrayList.add(qoeErrorDetail.getKey() + '.' + qoeErrorDetail.getValue());
        }
        zhvVar.c = new ager(";").b(arrayList);
        zhvVar.e = z;
        return zhvVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:79:0x00f7 A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x00f9 A[ORIG_RETURN, RETURN] */
    public static boolean i(String str) {
        switch (str) {
            case "android.stuck.bufferfull":
            case "fmt.unplayable":
            case "android.stuck.buffering":
            case "offline.nocontent":
            case "unimplemented":
            case "fmt.decode":
            case "unavailable":
            case "android.hfrdroppedframes":
            case "provision":
            case "net.retryexhausted":
            case "player.outofmemory":
            case "manifest.unparseable":
            case "":
            case "gl":
            case "auth":
            case "fmt.unparseable":
            case "android.stuck.playing":
            case "keyerror":
            case "surfaceunavailable":
            case "android.audiotrack":
            case "player.fatalexception":
            case "qoe.livewindow":
            case "policy.app":
            case "highdroppedframes":
            case "fmt.noneavailable":
                return true;
            default:
                return false;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:16:0x002b A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x002d A[ORIG_RETURN, RETURN] */
    public static boolean j(String str) {
        switch (str) {
            case "offline.partial.nocontent":
            case "servererror":
            case "stop":
            case "staleconfig":
                return true;
            default:
                return false;
        }
    }

    private static String q(String str, zhw zhwVar, Throwable th, boolean z) {
        return (z || zhwVar.equals(zhw.b) || str.startsWith("net.") || str.equals("player.timeout") || str.equals("fmt.noneavailable") || i(str)) ? zhf.a(th, true, 3) : zhf.a(th, false, 3);
    }

    public final long a() {
        return ((Long) this.c.orElse(0L)).longValue();
    }

    public final zhz b(zhy zhyVar) {
        return new zhz("qoe.ignored", a(), zhx.QOE_IGNORED_ORIGINAL_CODE.e + '.' + f() + ";reason." + zhyVar.l + ';' + this.e);
    }

    public final zhz c(zhu zhuVar) {
        if (f().equals("qoe.livewindow")) {
            return new zhz("qoe.restart.livewindow", a());
        }
        return new zhz("qoe.restart", a(), zhx.QOE_RESTART_ORIGINAL_CODE.e + '.' + f() + ";action." + zhuVar.z + ';' + this.e);
    }

    public final Object e(Class cls) {
        return cls.cast(Collection.EL.stream(this.h).filter(new xdo(cls, 16)).findFirst().orElse(null));
    }

    public final String f() {
        boolean zEquals = this.b.equals("");
        zhw zhwVar = this.d;
        if (zEquals) {
            return zhwVar.name().toLowerCase(Locale.ENGLISH);
        }
        return (zhwVar.equals(zhw.a) ? "" : String.valueOf(zhwVar.toString().toLowerCase(Locale.ENGLISH)).concat(".")).concat(String.valueOf(this.b));
    }

    public final boolean g() {
        return this.c.isPresent();
    }

    public final boolean h() {
        return this.d.equals(zhw.e);
    }

    public final boolean k() {
        return this.b.startsWith("net.");
    }

    public final boolean l() {
        return this.b.startsWith("qoe.restart");
    }

    public final boolean m() {
        String str = this.b;
        int iHashCode = str.hashCode();
        return iHashCode == -665462704 ? str.equals("unavailable") : iHashCode == 506615561 && str.equals("keyerror");
    }

    public final void n() {
        String.format("Error: %s:%s", this.b, ahno.Z(this.e));
    }

    public final void o() {
        this.f = true;
    }

    public final void p() {
        this.f = false;
        if (this.b.equals("player.fatalexception")) {
            this.b = "player.exception";
        }
    }

    public final String toString() {
        Optional optional = this.c;
        boolean z = this.f;
        String strF = f();
        String strValueOf = String.valueOf(optional);
        String strZ = ahno.Z(this.e);
        Throwable th = this.j;
        return "MedialibError(f=" + z + " code=" + strF + " mediaTimeMs=" + strValueOf + " details=" + strZ + " exception=" + (th != null ? th.toString() : "") + ')';
    }

    public zhz(zhw zhwVar, String str, long j, String str2) {
        this(zhwVar, str, j, str2, null, null);
    }

    public zhz(zhw zhwVar, String str, long j, String str2, Throwable th, Object obj) {
        this(zhwVar, str, Optional.of(Long.valueOf(j)), str2, th, null, false);
    }

    public zhz(zhw zhwVar, String str, long j, Throwable th) {
        this(zhwVar, str, j, null, th, null);
    }

    public zhz(zhw zhwVar, String str, long j) {
        this(zhwVar, str, j, (String) null);
    }

    public zhz(String str, long j) {
        this(zhw.a, str, j);
    }

    public zhz(String str, long j, String str2) {
        this(zhw.a, str, j, str2);
    }

    public zhz(String str, long j, Throwable th) {
        this(zhw.a, str, j, th);
    }
}
