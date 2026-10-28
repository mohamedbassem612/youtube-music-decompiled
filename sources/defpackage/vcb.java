package defpackage;

import java.io.File;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class vcb {
    public static final String a;
    public static final String b;
    public static final String c;
    public static final agke d;
    public static final String e;
    public static final String f;
    public static final String g;
    public static final long h;
    public static final long i;
    public static final long j;
    public static final long k;

    static {
        String path = new File("video_effects", "assets").getPath();
        a = path;
        b = new File("video_effects", "swazzle_assets_1").getPath();
        c = new File("video_effects", "effect_assets").getPath();
        d = agke.q("video_effects/swazzle_assets");
        e = new File(path, "stickers").getPath();
        f = new File(path, "dynamic_stickers").getPath();
        new File(path, "text").getPath();
        new File("video_effects", "effects_state_cache").getPath();
        new File("video_effects", "effects_state_upload").getPath();
        new File("video_effects", "media_composition_upload").getPath();
        new File("video_effects", "media_composition_recomposition").getPath();
        g = new File("video_effects", "font_caches").getPath();
        TimeUnit timeUnit = TimeUnit.DAYS;
        h = 1209600L;
        TimeUnit timeUnit2 = TimeUnit.DAYS;
        i = 86400L;
        TimeUnit timeUnit3 = TimeUnit.DAYS;
        j = 1209600L;
        TimeUnit timeUnit4 = TimeUnit.DAYS;
        k = 1209600L;
    }
}
