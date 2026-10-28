package defpackage;

import java.util.Locale;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
final class tga {
    private static final Pattern b = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private static final Pattern c = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern d = Pattern.compile("\\s*([^\\s/=;\"]+)/([^\\s/=;\"]+)\\s*(;.*)?", 32);
    private static final Pattern e = Pattern.compile("\\s*;\\s*([^\\s/=;\"]+)=(\"([^\"]*)\"|[^\\s;\"]*)");
    public final SortedMap a = new TreeMap();
    private String f;
    private String g;
    private String h;

    public tga(String str) {
        this.f = "application";
        this.g = "octet-stream";
        Matcher matcher = d.matcher(str);
        ahno.G(matcher.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        String strGroup = matcher.group(1);
        Pattern pattern = b;
        ahno.G(pattern.matcher(strGroup).matches(), "Type contains reserved characters");
        this.f = strGroup;
        this.h = null;
        String strGroup2 = matcher.group(2);
        ahno.G(pattern.matcher(strGroup2).matches(), "Subtype contains reserved characters");
        this.g = strGroup2;
        this.h = null;
        String strGroup3 = matcher.group(3);
        if (strGroup3 != null) {
            Matcher matcher2 = e.matcher(strGroup3);
            while (matcher2.find()) {
                String strGroup4 = matcher2.group(1);
                String strGroup5 = matcher2.group(3);
                strGroup5 = strGroup5 == null ? matcher2.group(2) : strGroup5;
                if (strGroup5 == null) {
                    this.h = null;
                    this.a.remove(strGroup4.toLowerCase(Locale.ENGLISH));
                } else {
                    ahno.G(c.matcher(strGroup4).matches(), "Name contains reserved characters");
                    this.h = null;
                    this.a.put(strGroup4.toLowerCase(Locale.ENGLISH), strGroup5);
                }
            }
        }
    }

    public final String a() {
        String str = this.h;
        if (str != null) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.f);
        sb.append('/');
        sb.append(this.g);
        for (Map.Entry entry : this.a.entrySet()) {
            String str2 = (String) entry.getValue();
            sb.append("; ");
            sb.append((String) entry.getKey());
            sb.append('=');
            if (!c.matcher(str2).matches()) {
                str2 = "\"" + str2.replace("\\", "\\\\").replace("\"", "\\\"") + '\"';
            }
            sb.append(str2);
        }
        String string = sb.toString();
        this.h = string;
        return string;
    }

    public final boolean equals(Object obj) {
        tga tgaVar;
        return (obj instanceof tga) && (tgaVar = (tga) obj) != null && this.f.equalsIgnoreCase(tgaVar.f) && this.g.equalsIgnoreCase(tgaVar.g) && this.a.equals(tgaVar.a);
    }

    public final int hashCode() {
        return a().hashCode();
    }

    public final String toString() {
        return a();
    }
}
