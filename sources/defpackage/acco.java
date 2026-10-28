package defpackage;

import android.text.Html;
import android.util.LruCache;
import android.util.Pair;
import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acco {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/subtitles/model/SubtitleWindowTextTimeline");
    public static final Pair b = new Pair(null, null);
    final List c;
    final List d;
    public final List e;
    private final LruCache f;

    public acco(List list, List list2, List list3, LruCache lruCache) {
        this.c = DesugarCollections.unmodifiableList(list);
        this.d = DesugarCollections.unmodifiableList(list2);
        this.e = DesugarCollections.unmodifiableList(list3);
        this.f = lruCache;
    }

    public static boolean c(CharSequence charSequence, CharSequence charSequence2) {
        if (charSequence.length() > charSequence2.length()) {
            return false;
        }
        for (int i = 0; i < charSequence.length(); i++) {
            if (charSequence.charAt(i) != charSequence2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public final int a(long j, boolean z) {
        List list = this.c;
        int iBinarySearch = Collections.binarySearch(list, Long.valueOf(j));
        if (iBinarySearch < 0 && ((iBinarySearch = (-iBinarySearch) - 2) < 0 || j >= ((Long) this.d.get(iBinarySearch)).longValue())) {
            return -1;
        }
        int i = z ? iBinarySearch - 1 : iBinarySearch + 1;
        while (i < list.size() && i >= 0 && ((Long) list.get(i)).longValue() <= j && ((Long) this.d.get(i)).longValue() > j) {
            int i2 = i;
            i = z ? i - 1 : i + 1;
            iBinarySearch = i2;
        }
        return iBinarySearch;
    }

    public final CharSequence b(CharSequence charSequence) {
        if (!(charSequence instanceof acbw)) {
            return charSequence;
        }
        acbw acbwVar = (acbw) charSequence;
        LruCache lruCache = this.f;
        if (lruCache == null) {
            return acbwVar.a();
        }
        CharSequence charSequence2 = (CharSequence) lruCache.get(charSequence);
        if (charSequence2 != null) {
            return charSequence2;
        }
        String str = acbwVar.a;
        CharSequence charSequenceC = acbwVar.b ? accm.c(str) : Html.fromHtml(str);
        lruCache.put(charSequence, charSequenceC);
        return charSequenceC;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.c;
            if (i >= list.size()) {
                return sb.toString();
            }
            sb.append('[');
            sb.append(list.get(i));
            sb.append(" - ");
            sb.append(this.d.get(i));
            sb.append(": ");
            sb.append((CharSequence) this.e.get(i));
            sb.append(']');
            i++;
        }
    }
}
