package defpackage;

import android.util.Printer;
import com.google.cardboard.sdk.R;
import internal.J.N;
import org.chromium.base.EarlyTraceEvent;
import org.chromium.base.TraceEvent;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes5.dex */
public class axjo implements Printer {
    private String a;

    public void a(String str) {
        String str2;
        EarlyTraceEvent.a();
        if (TraceEvent.a) {
            if (TraceEvent.c) {
                str2 = "Looper.dispatch: EVENT_NAME_FILTERED";
            } else {
                int iIndexOf = str.indexOf(40, 18);
                int iIndexOf2 = iIndexOf == -1 ? -1 : str.indexOf(41, iIndexOf);
                String strSubstring = "";
                String strSubstring2 = iIndexOf2 != -1 ? str.substring(iIndexOf + 1, iIndexOf2) : "";
                int iIndexOf3 = str.indexOf(R.styleable.AppCompatTheme_windowMinWidthMinor, 18);
                int iIndexOf4 = iIndexOf3 == -1 ? -1 : str.indexOf(58, iIndexOf3);
                if (iIndexOf4 == -1) {
                    iIndexOf4 = str.length();
                }
                if (iIndexOf3 != -1 && iIndexOf4 - iIndexOf3 >= 2) {
                    strSubstring = str.substring(iIndexOf3 + 2, iIndexOf4);
                }
                str2 = "Looper.dispatch: " + strSubstring2 + '(' + strSubstring + ')';
            }
            this.a = str2;
            if (TraceEvent.a) {
                N.M_y76mct(this.a);
            } else {
                EarlyTraceEvent.a();
            }
        }
    }

    public void b(String str) {
        EarlyTraceEvent.a();
        if (TraceEvent.a && this.a != null) {
            if (TraceEvent.a) {
                N.MLJecZJ9();
            } else {
                EarlyTraceEvent.a();
            }
        }
        this.a = null;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">")) {
            a(str);
        } else {
            b(str);
        }
    }
}
