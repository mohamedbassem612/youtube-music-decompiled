package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Build;
import android.util.Log;
import androidx.car.app.model.Alert;
import com.google.android.apps.youtube.music.R;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public enum ackm {
    ROBOTO_REGULAR(14, "sans-serif", 0),
    ROBOTO_LIGHT(16, "sans-serif-light", 1),
    ROBOTO_CONDENSED(16, "sans-serif-condensed", 2),
    ROBOTO_THIN(17, "sans-serif-thin", 3),
    ROBOTO_CONDENSED_LIGHT(20, "sans-serif-condensed-light", 4),
    ROBOTO_BLACK(21, "sans-serif-black", 5),
    ROBOTO_MEDIUM(21, "sans-serif-medium", 6),
    ROBOTO_MONOSPACE(21, "sans-serif-monospace", 7),
    ROBOTO_SMALLCAPS(21, "sans-serif-smallcaps", 8),
    YTSANS_MEDIUM("sans-serif-medium", 0, "YTSans-Medium.otf"),
    YTSANS_BOLD("sans-serif-bold", 1, "YTSans-Bold.otf"),
    YOUTUBE_SANS_LIGHT(300),
    YOUTUBE_SANS_REGULAR(400),
    YOUTUBE_SANS_MEDIUM(500),
    YOUTUBE_SANS_SEMIBOLD(600),
    YOUTUBE_SANS_BOLD(700),
    YOUTUBE_SANS_EXTRABOLD(800),
    YOUTUBE_SANS_BLACK(900);

    public static final Map s = new HashMap();
    private static final Object w = new Object();
    private final String A;
    final int t;
    public final int u;
    public final int v;
    private final int y;
    private final String z;

    ackm(int i) {
        this.z = "";
        this.u = -1;
        this.t = -1;
        this.y = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = i;
        this.A = i == ackl.BOLD.h ? "youtube_sans_bold_font.ttf" : null;
    }

    public static int a(ackl acklVar) {
        return acklVar.ordinal() != 4 ? 0 : 1;
    }

    public static Typeface b(Context context, Typeface typeface, int i) {
        Typeface typefaceCreate;
        synchronized (w) {
            ackp.c(context);
            typefaceCreate = Typeface.create(typeface, i);
            typefaceCreate.getClass();
        }
        return typefaceCreate;
    }

    public static ackm d(int i) {
        for (ackm ackmVar : values()) {
            if (i != -1 && ackmVar.t == i) {
                return ackmVar;
            }
        }
        return null;
    }

    private static int e(ackl acklVar) {
        switch (acklVar.ordinal()) {
            case 0:
                return R.font.youtube_sans_light;
            case 1:
                return R.font.youtube_sans;
            case 2:
                return R.font.youtube_sans_medium;
            case 3:
                return R.font.youtube_sans_semibold;
            case 4:
                return R.font.youtube_sans_bold;
            case 5:
                return R.font.youtube_sans_extrabold;
            case 6:
                return R.font.youtube_sans_black;
            default:
                throw new RuntimeException(null, null);
        }
    }

    private static Typeface f(Context context, int i) {
        return b(context, Typeface.SANS_SERIF, i);
    }

    private final Typeface g(Context context) {
        Map map;
        String str = this.A;
        if (str == null) {
            return null;
        }
        Map map2 = s;
        synchronized (map2) {
            Typeface typeface = (Typeface) map2.get(str);
            if (typeface != null) {
                return typeface;
            }
            try {
                map2.put(str, Typeface.createFromAsset(context.getAssets(), str));
                map = map2;
            } catch (RuntimeException unused) {
                map = s;
                map.put(str, f(context, 0));
            }
            return (Typeface) map.get(str);
        }
    }

    private static void h(Context context, ackl acklVar) {
        int iE = e(acklVar);
        String str = acklVar.i;
        Map map = s;
        synchronized (map) {
            if (((Typeface) map.get(str)) != null) {
                return;
            }
            try {
                avt.d(context, iE, new ackk(context, acklVar, str));
            } catch (Resources.NotFoundException e) {
                if (Log.isLoggable("Typefaces", 6)) {
                    Log.e("Typefaces", "Font not found: ".concat(String.valueOf(str)), e);
                }
            } catch (RuntimeException e2) {
                if (Log.isLoggable("Typefaces", 6)) {
                    Log.e("Typefaces", "Failed to load font: ".concat(String.valueOf(str)), e2);
                }
            }
        }
    }

    public final Typeface c(Context context, int i) {
        Typeface typeface;
        Typeface typefaceG;
        Typeface typefaceCreate;
        if (i < 0 || i > 3) {
            i = 0;
        }
        if (Build.VERSION.SDK_INT >= this.y) {
            String str = this.z;
            synchronized (w) {
                ackp.c(context);
                typefaceCreate = Typeface.create(str, i);
                typefaceCreate.getClass();
            }
            return typefaceCreate;
        }
        ackl acklVar = null;
        Typeface typefaceG2 = this.A != null ? g(context) : null;
        if (typefaceG2 == null) {
            int i2 = this.v;
            for (ackl acklVar2 : ackl.values()) {
                if (acklVar2.h == i2) {
                    try {
                        context.getClass();
                        ((aclb) atqp.a(a.aJ(context.getApplicationContext()), aclb.class)).bY().isPresent();
                    } catch (ClassCastException | IllegalArgumentException | IllegalStateException e) {
                        if (Log.isLoggable("Typefaces", 5)) {
                            Log.w("Typefaces", "Failed to check if youtube sans registry is enabled", e);
                        }
                    }
                    int i3 = this.v;
                    for (ackl acklVar3 : ackl.values()) {
                        if (acklVar3.h == i3) {
                            acklVar = acklVar3;
                            break;
                        }
                    }
                    if (acklVar == null) {
                        acklVar = ackl.BOLD;
                    }
                    int iE = e(acklVar);
                    Map map = s;
                    synchronized (map) {
                        typefaceG = (Typeface) map.get(acklVar.i);
                    }
                    if (typefaceG == null) {
                        Typeface typefaceB = avt.b(context, iE);
                        if (typefaceB != null) {
                            Typeface typefaceB2 = b(context, typefaceB, a(acklVar));
                            synchronized (map) {
                                String str2 = acklVar.i;
                                Typeface typeface2 = (Typeface) map.get(str2);
                                if (typeface2 != null) {
                                    typefaceG = typeface2;
                                } else {
                                    map.put(str2, typefaceB2);
                                    typefaceG = typefaceB2;
                                }
                            }
                        } else {
                            h(context, acklVar);
                            typefaceG = YOUTUBE_SANS_BOLD.g(context);
                        }
                    }
                    typeface = typefaceG;
                }
            }
            typeface = typefaceG2;
        } else {
            typeface = typefaceG2;
        }
        return typeface == null ? f(context, i) : typeface;
    }

    ackm(int i, String str, int i2) {
        this.y = i;
        this.z = str;
        this.t = i2;
        this.A = null;
        this.u = -1;
        this.v = -1;
    }

    ackm(String str, int i, String str2) {
        this.z = str;
        this.u = i;
        this.A = str2;
        this.t = -1;
        this.y = Alert.DURATION_SHOW_INDEFINITELY;
        this.v = -1;
    }
}
