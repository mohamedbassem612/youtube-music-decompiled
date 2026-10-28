package defpackage;

import androidx.work.WorkerParameters;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes2.dex */
public final class afly {
    public static final Pattern a = Pattern.compile("^(tiktok_account_work$|unique_|account_id_).*");
    public static final Pattern b = Pattern.compile("^(TikTokWorker#|tiktok_).*");

    public static agkz a(Set set) {
        afx afxVar = new afx(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (str.startsWith("TikTokWorker#")) {
                afxVar.add(str.substring(13));
            }
        }
        return agkz.n(afxVar);
    }

    public static String b(WorkerParameters workerParameters) {
        return (String) aguu.M(a(workerParameters.c));
    }
}
