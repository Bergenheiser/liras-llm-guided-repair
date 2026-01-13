package it.polimi.generator;

import com.google.common.collect.Iterators;
import it.polimi.lIRAs.Model;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.IteratorExtensions;
import org.eclipse.xtext.xbase.lib.Procedures.Procedure1;

@SuppressWarnings("all")
public class LIRAsGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final Procedure1<Model> _function = (Model model) -> {
      final String xml = this.generateXML(model);
      fsa.generateFile("locations.xml", xml);
    };
    IteratorExtensions.<Model>forEach(Iterators.<Model>filter(resource.getAllContents(), Model.class), _function);
  }

  public String generateXML(final Model model) {
    StringConcatenation _builder = new StringConcatenation();
    String _readMain = this.readMain();
    _builder.append(_readMain);
    _builder.newLineIfNotEmpty();
    return _builder.toString();
  }

  public String readMain() {
    try {
      final String filePath = "C:\\Users\\albif\\OneDrive - Politecnico di Milano\\Desktop\\Tesi_TagliaferroAlberto\\uppaal\\Base_Template\\main.xml";
      final List<String> lines = Files.readAllLines(Paths.get(filePath));
      return IterableExtensions.join(lines, "\n");
    } catch (final Throwable _t) {
      if (_t instanceof IOException) {
        final IOException e = (IOException)_t;
        e.printStackTrace();
        return "Error reading file";
      } else {
        throw Exceptions.sneakyThrow(_t);
      }
    }
  }
}
