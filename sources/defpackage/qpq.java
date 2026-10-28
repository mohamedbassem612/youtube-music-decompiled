package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.net.Uri;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes.dex */
public final class qpq {
    private final Context a;
    private final String b;
    private String c = "files";
    private String d = "common";
    private Account e = qpr.b;
    private String f = "";
    private final agjz g = new agjz(4);

    public qpq(Context context) {
        rmp.D(context != null, "Context cannot be null", new Object[0]);
        this.a = context;
        this.b = context.getPackageName();
    }

    private final void e(String str) {
        Set set = qpr.d;
        rmp.D(set.contains(str), "The only supported locations are %s: %s", set, str);
        this.c = str;
    }

    public final Uri a() {
        return new Uri.Builder().scheme("android").authority(this.b).path("/" + this.c + '/' + this.d + '/' + qpo.b(this.e) + '/' + this.f).encodedFragment(qql.a(this.g.g())).build();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0078  */
    /* JADX WARN: Code duplicated, block: B:18:0x008b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0099  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:44:0x0148  */
    public final void b(String str) {
        File fileH;
        String absolutePath;
        String absolutePath2;
        String strSubstring;
        Context context = this.a;
        File fileI = rmp.I(context);
        String absolutePath3 = new File(fileI, "managed").getAbsolutePath();
        if (str.startsWith(absolutePath3)) {
            e("managed");
            strSubstring = str.substring(absolutePath3.length());
        } else {
            String absolutePath4 = fileI.getAbsolutePath();
            if (str.startsWith(absolutePath4)) {
                e("files");
                strSubstring = str.substring(absolutePath4.length());
            } else {
                String absolutePath5 = context.getCacheDir().getAbsolutePath();
                if (str.startsWith(absolutePath5)) {
                    e("cache");
                    strSubstring = str.substring(absolutePath5.length());
                } else {
                    File externalFilesDir = context.getExternalFilesDir(null);
                    if (externalFilesDir != null) {
                        String absolutePath6 = externalFilesDir.getAbsolutePath();
                        if (str.startsWith(absolutePath6)) {
                            e("external");
                            strSubstring = str.substring(absolutePath6.length());
                        } else {
                            fileH = rmp.H(context);
                            absolutePath = new File(fileH, "files").getAbsolutePath();
                            if (str.startsWith(absolutePath)) {
                                e("directboot-files");
                                strSubstring = str.substring(absolutePath.length());
                            } else {
                                absolutePath2 = new File(fileH, "cache").getAbsolutePath();
                                if (str.startsWith(absolutePath2)) {
                                    throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(str)));
                                }
                                e("directboot-cache");
                                strSubstring = str.substring(absolutePath2.length());
                            }
                        }
                    } else {
                        fileH = rmp.H(context);
                        absolutePath = new File(fileH, "files").getAbsolutePath();
                        if (str.startsWith(absolutePath)) {
                            e("directboot-files");
                            strSubstring = str.substring(absolutePath.length());
                        } else {
                            absolutePath2 = new File(fileH, "cache").getAbsolutePath();
                            if (str.startsWith(absolutePath2)) {
                                throw new IllegalArgumentException("Path must be in app-private files dir or external files dir: ".concat(String.valueOf(str)));
                            }
                            e("directboot-cache");
                            strSubstring = str.substring(absolutePath2.length());
                        }
                    }
                }
            }
        }
        List listAsList = Arrays.asList(strSubstring.split(File.separator));
        rmp.D(listAsList.size() >= 3, "Path must be in module and account subdirectories: %s", str);
        c((String) listAsList.get(1));
        String str2 = (String) listAsList.get(2);
        if ("managed".equals(this.c)) {
            Account account = qpo.a;
            if (!"shared".equals(str2)) {
                try {
                    Integer.parseInt(str2);
                    rmp.D(false, "AccountManager cannot be null", new Object[0]);
                    try {
                        throw null;
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        throw new IllegalArgumentException(new qqb(e));
                    } catch (ExecutionException e2) {
                        throw new IllegalArgumentException(new qqb(e2.getCause()));
                    }
                } catch (NumberFormatException e3) {
                    throw new IllegalArgumentException(e3);
                }
            }
        }
        Account accountA = qpo.a(str2);
        qpo.b(accountA);
        this.e = accountA;
        d(strSubstring.substring(this.d.length() + str2.length() + 2));
    }

    public final void c(String str) {
        rmp.D(qpr.a.matcher(str).matches(), "Module must match [a-z]+(_[a-z]+)*: %s", str);
        rmp.D(!qpr.c.contains(str), "Module name is reserved and cannot be used: %s", str);
        this.d = str;
    }

    public final void d(String str) {
        if (str.startsWith("/")) {
            str = str.substring(1);
        }
        Pattern pattern = qpr.a;
        this.f = str;
    }
}
