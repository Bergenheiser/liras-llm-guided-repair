package it.polimi.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import it.polimi.lIRAs.Model
import java.nio.file.Files
import java.nio.file.Paths
import java.io.IOException

class LIRAsGenerator extends AbstractGenerator {

    override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
        resource.allContents.filter(Model).forEach[model |
            val xml = generateXML(model)
            fsa.generateFile('locations.xml', xml)
        ]
    }

    def String generateXML(Model model) {
        '''
    «readMain()»
        '''
    }

    def String readMain() {
        try {
            val filePath = "C:\\Users\\albif\\OneDrive - Politecnico di Milano\\Desktop\\Tesi_TagliaferroAlberto\\uppaal\\Base_Template\\main.xml"
            val lines = Files.readAllLines(Paths.get(filePath))
            return lines.join("\n")
        } catch (IOException e) {
            e.printStackTrace
            return "Error reading file"
        }
    }
}
