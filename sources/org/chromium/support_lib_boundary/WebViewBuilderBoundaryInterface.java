package org.chromium.support_lib_boundary;

import android.content.Context;
import android.webkit.WebView;
import defpackage.a;
import defpackage.ie$$ExternalSyntheticApiModelOutline0;
import j$.util.function.Consumer$CC;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public interface WebViewBuilderBoundaryInterface {

    /* JADX INFO: compiled from: PG */
    @Retention(RetentionPolicy.SOURCE)
    public @interface Baseline {
        public static final int DEFAULT = 0;
    }

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes3.dex */
    @Target({ElementType.TYPE_USE})
    @Retention(RetentionPolicy.SOURCE)
    public @interface ConfigField {
        public static final int BASELINE = 0;
        public static final int JAVASCRIPT_INTERFACE = 1;
        public static final int PROFILE_NAME = 3;
        public static final int RESTRICT_JAVASCRIPT_INTERFACE = 2;
    }

    void applyTo(WebView webView, Consumer consumer);

    WebView build(Context context, Consumer consumer);

    /* JADX INFO: compiled from: PG */
    /* JADX INFO: loaded from: classes4.dex */
    public class Config implements Consumer {
        public String profileName;
        public boolean restrictJavascriptInterface;
        public int baseline = 0;
        final List a = new ArrayList();
        final Map b = new LinkedHashMap();
        final List c = new ArrayList();

        public void accept(BiConsumer biConsumer) {
            biConsumer.accept(0, Integer.valueOf(this.baseline));
            biConsumer.accept(2, Boolean.valueOf(this.restrictJavascriptInterface));
            biConsumer.accept(1, new Object[]{this.a, new ArrayList(this.b.keySet()), this.c});
            if (this.profileName != null) {
                biConsumer.accept(3, this.profileName);
            }
        }

        public void addJavascriptInterface(Object obj, String str, List list) {
            Map map = this.b;
            if (map.containsKey(str)) {
                throw new IllegalArgumentException(a.bU((byte) 34, str, "A duplicate JavaScript interface was provided for \""));
            }
            this.a.add(obj);
            map.put(str, Boolean.TRUE);
            this.c.add(list);
        }

        public /* synthetic */ Consumer andThen(Consumer consumer) {
            return Consumer$CC.$default$andThen(this, consumer);
        }

        @Override // java.util.function.Consumer
        /* JADX INFO: renamed from: accept */
        public /* bridge */ /* synthetic */ void r(Object obj) {
            accept(ie$$ExternalSyntheticApiModelOutline0.m830m(obj));
        }
    }
}
