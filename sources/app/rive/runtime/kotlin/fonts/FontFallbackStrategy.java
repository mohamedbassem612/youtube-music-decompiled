package app.rive.runtime.kotlin.fonts;

import defpackage.awno;
import java.lang.ref.WeakReference;
import java.util.List;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes3.dex */
public interface FontFallbackStrategy {
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: PG */
    public final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static WeakReference stylePickerRef;

        private Companion() {
        }

        public final native void cppResetFontCache();

        public final FontFallbackStrategy getStylePicker() {
            WeakReference weakReference = stylePickerRef;
            if (weakReference != null) {
                return (FontFallbackStrategy) weakReference.get();
            }
            return null;
        }

        public final List pickFont(int i) {
            FontFallbackStrategy stylePicker = getStylePicker();
            return stylePicker == null ? awno.a : stylePicker.getFont(Fonts.Weight.Companion.fromInt(i));
        }

        public final void setStylePicker(FontFallbackStrategy fontFallbackStrategy) {
            if (getStylePicker() != fontFallbackStrategy) {
                stylePickerRef = fontFallbackStrategy != null ? new WeakReference(fontFallbackStrategy) : null;
                cppResetFontCache();
            }
        }
    }

    List getFont(Fonts.Weight weight);
}
