package com.google.android.icing;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class BreakIteratorBatcher {
    private final BreakIterator iterator;

    public BreakIteratorBatcher(Locale locale) {
        this.iterator = BreakIterator.getWordInstance(locale);
    }

    public int first() {
        return this.iterator.first();
    }

    public int following(int i) {
        return this.iterator.following(i);
    }

    public int[] next(int i) {
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            int next = this.iterator.next();
            if (next == -1) {
                break;
            }
            arrayList.add(Integer.valueOf(next));
        }
        int[] iArr = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            iArr[i3] = ((Integer) arrayList.get(i3)).intValue();
        }
        return iArr;
    }

    public int preceding(int i) {
        return this.iterator.preceding(i);
    }

    public void setText(String str) {
        this.iterator.setText(str);
    }
}
