package defpackage;

import j$.util.DesugarCollections;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class acch {
    public static final agrf a = agrf.h("com/google/android/libraries/youtube/player/subtitles/model/SubtitleWindowSettingsTimeline");
    final List b;
    private final List c;

    public acch(List list, List list2) {
        ahno.P(list.size() == list2.size(), "startTimes and settings differ in size");
        this.b = DesugarCollections.unmodifiableList(list);
        this.c = DesugarCollections.unmodifiableList(list2);
    }

    public final synchronized accf a(long j) {
        accf accfVar;
        int iBinarySearch = Collections.binarySearch(this.b, Long.valueOf(j));
        if (iBinarySearch >= 0) {
            accfVar = (accf) this.c.get(iBinarySearch);
        } else {
            int i = (-iBinarySearch) - 2;
            accfVar = i >= 0 ? (accf) this.c.get(i) : accf.a;
        }
        return accfVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (true) {
            List list = this.b;
            if (i >= list.size()) {
                return sb.toString();
            }
            sb.append('[');
            sb.append(list.get(i));
            sb.append(": ");
            sb.append(this.c.get(i));
            sb.append(']');
            i++;
        }
    }
}
