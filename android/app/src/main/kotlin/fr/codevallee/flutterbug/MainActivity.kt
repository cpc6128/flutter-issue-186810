package fr.codevallee.flutterbug

import io.flutter.embedding.android.FlutterFragmentActivity
import io.flutter.embedding.engine.FlutterEngine
import androidx.annotation.NonNull

class MainActivity : FlutterFragmentActivity() {
    // Si tu n'as pas de MethodChannel (code natif spécifique),
    // tu peux même supprimer cette fonction.
    override fun configureFlutterEngine(@NonNull flutterEngine: FlutterEngine) {
        super.configureFlutterEngine(flutterEngine)
        // Tes futurs MethodChannels iront ici
    }

    // Garde le Fix uniquement si tu as des fuites mémoires avérées
    // avec des vues natives (Maps, etc.)
    override fun onDestroy() {
        flutterEngine?.platformViewsController?.onDetachedFromJNI()
        super.onDestroy()
    }
}