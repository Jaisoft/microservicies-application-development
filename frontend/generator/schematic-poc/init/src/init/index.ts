import { Rule, SchematicContext, Tree } from '@angular-devkit/schematics';


export function init(_options: any): Rule {
  return (tree: Tree, _context: SchematicContext) => {
    tree.create('hello.js', `console.log('Hi ${_options.name}Frontend Rules');`);
    return tree;
  };
}
