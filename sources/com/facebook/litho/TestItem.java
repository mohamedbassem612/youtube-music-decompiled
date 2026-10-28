package com.facebook.litho;

import android.graphics.Rect;
import defpackage.gzj;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public class TestItem {
    public String a;
    public ComponentHost c;
    public Object d;
    public final Rect b = new Rect();
    private final AcquireKey e = new AcquireKey();

    /* JADX INFO: compiled from: PG */
    public final class AcquireKey {
    }

    public AcquireKey getAcquireKey() {
        return this.e;
    }

    public Rect getBounds() {
        return this.b;
    }

    public ComponentHost getHost() {
        return this.c;
    }

    public String getTestKey() {
        return this.a;
    }

    public String getTextContent() {
        List textItems = gzj.bB(Collections.singletonList(this.d)).getTextItems();
        StringBuilder sb = new StringBuilder();
        int size = textItems.size();
        for (int i = 0; i < size; i++) {
            sb.append((CharSequence) textItems.get(i));
        }
        return sb.toString();
    }
}
