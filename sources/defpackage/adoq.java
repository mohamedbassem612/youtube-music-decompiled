package defpackage;

import app.rive.RiveFile;
import app.rive.ViewModelInstance;
import app.rive.runtime.kotlin.core.ViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: PG */
/* JADX INFO: loaded from: classes4.dex */
public final class adoq {
    public static final adoq a = new adoq();
    public static final agrf b = agrf.h("com/google/android/libraries/youtube/rendering/rive/RiveCompletionSignal");
    private static final Set c = atqq.aS(new String[]{"_isCompleted", "isCompleted", "isComplete", "_isComplete"});

    /* JADX WARN: Code duplicated, block: B:27:0x006c A[Catch: Exception -> 0x00ae, CancellationException -> 0x00d1, TryCatch #2 {CancellationException -> 0x00d1, Exception -> 0x00ae, blocks: (B:12:0x0026, B:24:0x0058, B:25:0x0066, B:27:0x006c, B:29:0x007b, B:31:0x0087, B:32:0x008b, B:33:0x009a, B:35:0x00a0, B:17:0x0036, B:22:0x0049, B:20:0x003d), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00a0 A[Catch: Exception -> 0x00ae, CancellationException -> 0x00d1, LOOP:1: B:33:0x009a->B:35:0x00a0, LOOP_END, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00d1, Exception -> 0x00ae, blocks: (B:12:0x0026, B:24:0x0058, B:25:0x0066, B:27:0x006c, B:29:0x007b, B:31:0x0087, B:32:0x008b, B:33:0x009a, B:35:0x00a0, B:17:0x0036, B:22:0x0049, B:20:0x003d), top: B:42:0x0020 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(RiveFile riveFile, ViewModelInstance viewModelInstance, awoq awoqVar) throws Throwable {
        adop adopVar;
        ArrayList arrayList;
        Iterator it;
        ViewModel.Property property;
        if (awoqVar instanceof adop) {
            adopVar = (adop) awoqVar;
            int i = adopVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                adopVar.c = i - Integer.MIN_VALUE;
            } else {
                adopVar = new adop(this, awoqVar);
            }
        } else {
            adopVar = new adop(this, awoqVar);
        }
        Object viewModelName = adopVar.a;
        Object obj = awox.a;
        int i2 = adopVar.c;
        try {
            if (i2 != 0) {
                if (i2 == 1) {
                    riveFile = adopVar.e;
                    this = adopVar.d;
                    atqp.j(viewModelName);
                } else {
                    if (i2 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    atqp.j(viewModelName);
                }
                List list = (List) viewModelName;
                list.getClass();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : list) {
                    property = (ViewModel.Property) obj2;
                    if (property.getType() != ViewModel.PropertyDataType.BOOLEAN && c.contains(property.getName())) {
                        arrayList2.add(obj2);
                    }
                }
                arrayList = new ArrayList(atqq.N(arrayList2, 10));
                it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((ViewModel.Property) it.next()).getName());
                }
                return arrayList;
            }
            atqp.j(viewModelName);
            adopVar.d = this;
            adopVar.e = riveFile;
            adopVar.c = 1;
            viewModelName = viewModelInstance.getViewModelName(adopVar);
            if (viewModelName == obj) {
                return obj;
            }
            adopVar.d = this;
            adopVar.e = null;
            adopVar.c = 2;
            viewModelName = riveFile.getViewModelProperties((String) viewModelName, adopVar);
            if (viewModelName == obj) {
                return obj;
            }
            List list2 = (List) viewModelName;
            list2.getClass();
            ArrayList arrayList3 = new ArrayList();
            while (r6.hasNext()) {
                property = (ViewModel.Property) obj2;
                if (property.getType() != ViewModel.PropertyDataType.BOOLEAN) {
                }
            }
            arrayList = new ArrayList(atqq.N(arrayList3, 10));
            it = arrayList3.iterator();
            while (it.hasNext()) {
                arrayList.add(((ViewModel.Property) it.next()).getName());
            }
            return arrayList;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            ((agrc) ((agrc) b.c()).j(e2).k("com/google/android/libraries/youtube/rendering/rive/RiveCompletionSignal", "findCompletionPropertyNames", 51, "RiveCompletionSignal.kt")).t("Failed to resolve Rive view model completion properties");
            return awno.a;
        }
    }
}
