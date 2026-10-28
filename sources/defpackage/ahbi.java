package defpackage;

import j$.util.Objects;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class ahbi {
    public static final agdw a;
    public static final ahbi b;
    private static final agkg c;
    private static final Map d;
    private static final aciz j;
    private final String e;
    private final String f;
    private final agkg g;
    private String h;
    private int i;

    static {
        String strAe = ahno.ae(StandardCharsets.UTF_8.name());
        agkf agkfVar = new agkf();
        agkfVar.b("charset", strAe);
        c = agkfVar.a();
        a = new agdh(new agdh(new agdh(agdk.a, new agds(agdq.a)), new agdp(' ')), agdw.i("()<>@,;:\\\"/[]?="));
        agdw.i("\"\\\r");
        agdw.h(" \t\r\n");
        d = new HashMap();
        d("*", "*");
        d("text", "*");
        d("image", "*");
        d("audio", "*");
        d("video", "*");
        d("application", "*");
        d("font", "*");
        a("text", "cache-manifest");
        a("text", "css");
        a("text", "csv");
        a("text", "html");
        a("text", "calendar");
        a("text", "markdown");
        a("text", "plain");
        a("text", "javascript");
        a("text", "tab-separated-values");
        a("text", "vcard");
        a("text", "vnd.wap.wml");
        a("text", "xml");
        a("text", "vtt");
        d("image", "bmp");
        d("image", "x-canon-crw");
        d("image", "gif");
        d("image", "vnd.microsoft.icon");
        d("image", "jpeg");
        d("image", "png");
        d("image", "vnd.adobe.photoshop");
        a("image", "svg+xml");
        d("image", "tiff");
        d("image", "avif");
        d("image", "webp");
        d("image", "heif");
        d("image", "jp2");
        d("audio", "mp4");
        d("audio", "mpeg");
        d("audio", "ogg");
        d("audio", "webm");
        d("audio", "l16");
        d("audio", "l24");
        d("audio", "basic");
        d("audio", "aac");
        d("audio", "vorbis");
        d("audio", "x-ms-wma");
        d("audio", "x-ms-wax");
        d("audio", "vnd.rn-realaudio");
        d("audio", "vnd.wave");
        d("video", "mp4");
        d("video", "mpeg");
        d("video", "ogg");
        d("video", "quicktime");
        d("video", "webm");
        d("video", "x-ms-wmv");
        d("video", "x-flv");
        d("video", "3gpp");
        d("video", "3gpp2");
        a("application", "xml");
        a("application", "atom+xml");
        d("application", "x-bzip2");
        a("application", "dart");
        d("application", "vnd.apple.pkpass");
        d("application", "vnd.ms-fontobject");
        d("application", "epub+zip");
        d("application", "x-www-form-urlencoded");
        d("application", "pkcs12");
        d("application", "binary");
        d("application", "cbor");
        d("application", "geo+json");
        d("application", "gzip");
        d("application", "x-gzip");
        d("application", "hal+json");
        a("application", "javascript");
        d("application", "jose");
        d("application", "jose+json");
        b = a("application", "json");
        d("application", "jwt");
        a("application", "manifest+json");
        d("application", "vnd.google-earth.kml+xml");
        d("application", "vnd.google-earth.kmz");
        d("application", "mbox");
        d("application", "x-apple-aspen-config");
        d("application", "vnd.ms-excel");
        d("application", "vnd.ms-outlook");
        d("application", "vnd.ms-powerpoint");
        d("application", "msword");
        d("application", "dash+xml");
        d("application", "wasm");
        d("application", "x-nacl");
        d("application", "x-pem-file");
        d("application", "x-pnacl");
        d("application", "octet-stream");
        d("application", "ogg");
        d("application", "vnd.openxmlformats-officedocument.wordprocessingml.document");
        d("application", "vnd.openxmlformats-officedocument.presentationml.presentation");
        d("application", "vnd.openxmlformats-officedocument.spreadsheetml.sheet");
        d("application", "vnd.oasis.opendocument.graphics");
        d("application", "vnd.oasis.opendocument.presentation");
        d("application", "vnd.oasis.opendocument.spreadsheet");
        d("application", "vnd.oasis.opendocument.text");
        a("application", "opensearchdescription+xml");
        d("application", "pdf");
        d("application", "postscript");
        d("application", "protobuf");
        a("application", "rdf+xml");
        a("application", "rtf");
        d("application", "font-sfnt");
        d("application", "x-shockwave-flash");
        d("application", "vnd.sketchup.skp");
        a("application", "soap+xml");
        d("application", "x-tar");
        d("application", "font-woff");
        d("application", "font-woff2");
        a("application", "xhtml+xml");
        a("application", "xrd+xml");
        d("application", "zip");
        d("font", "collection");
        d("font", "otf");
        d("font", "sfnt");
        d("font", "ttf");
        d("font", "woff");
        d("font", "woff2");
        d("application", "yaml");
        j = new aciz(new ager("; "));
    }

    private ahbi(String str, String str2, agkg agkgVar) {
        this.e = str;
        this.f = str2;
        this.g = agkgVar;
    }

    private static ahbi a(String str, String str2) {
        ahbi ahbiVar = new ahbi(str, str2, c);
        c(ahbiVar);
        agev.i(StandardCharsets.UTF_8);
        return ahbiVar;
    }

    private final Map b() {
        return aguu.p(this.g.map, new afzk(20));
    }

    private static void c(ahbi ahbiVar) {
        d.put(ahbiVar, ahbiVar);
    }

    private static void d(String str, String str2) {
        c(new ahbi(str, str2, agir.a));
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbi) {
            ahbi ahbiVar = (ahbi) obj;
            if (this.e.equals(ahbiVar.e) && this.f.equals(ahbiVar.f) && b().equals(ahbiVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.i;
        if (i != 0) {
            return i;
        }
        int iHash = Objects.hash(this.e, this.f, b());
        this.i = iHash;
        return iHash;
    }

    public final String toString() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append('/');
        sb.append(this.f);
        agkg agkgVar = this.g;
        if (!agkgVar.w()) {
            sb.append("; ");
            j.q(sb, new agot(new agou(agkgVar, new agor(new afzk(19), 0))));
        }
        String string = sb.toString();
        this.h = string;
        return string;
    }
}
